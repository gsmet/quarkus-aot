#!/usr/bin/env bash
set -euo pipefail

if [ -z "${PATH_TO_ASYNC_PROFILER:-}" ]; then
    echo "Error: Please point PATH_TO_ASYNC_PROFILER to your AsyncProfiler installation"
    exit 1
fi

if [ $# -lt 1 ]; then
    echo "Usage: $0 <output-file-base-name>"
    exit 1
fi
JFR_FILE="measures-$1.jfr"
ALLOCATIONS_FILE="measures-$1-allocations.txt"
PERFSTATS_FILE="measures-$1-perfstats.txt"

if [ -f "$JFR_FILE" ]; then
    echo "Error: File '$JFR_FILE' already exists"
    exit 1
fi

./mvnw clean verify -Dquarkus.package.jar.type=aot-jar -Dquarkus.package.jar.appcds.use-aot=true -DskipITs=false

pushd target
perf stat -d -- taskset -c 0,2,4,6 ../run.sh java -jar -XX:AOTCache=quarkus-app/app.aot -jar quarkus-app/quarkus-run.jar &> ../${PERFSTATS_FILE} &
sleep 1
PID=$(cat pidfile)
kill $PID
sleep 5

java -XX:StartFlightRecording=name=recording,filename=../${JFR_FILE},settings=../allocations.jfc -XX:AOTCache=quarkus-app/aapp.aot -jar quarkus-app/quarkus-run.jar &
PID=$!
sleep 5
jcmd $PID JFR.stop name="recording"
sleep 5
kill $PID
sleep 8
popd

echo "Allocations report" > ${ALLOCATIONS_FILE}
echo "==================" >> ${ALLOCATIONS_FILE}
echo "" >> ${ALLOCATIONS_FILE}

jfr print --json ${JFR_FILE} | jq '
.recording.events
| map(select(.type == "jdk.ObjectAllocationInNewTLAB" or .type == "jdk.ObjectAllocationOutsideTLAB"))
| {
    totalAllocationSize: map(.values.allocationSize) | add,
    totalAllocations: length,
    perClass: (
        group_by(.values.objectClass.name)
        | map({
            className: .[0].values.objectClass.name,
            count: length,
            totalSize: map(.values.allocationSize) | add
        })
        | sort_by(-.totalSize)
    )
    }
' >> ${ALLOCATIONS_FILE}

echo "Allocations report written to: ${ALLOCATIONS_FILE}"
echo "Perfstat report written to: ${PERFSTATS_FILE}"
