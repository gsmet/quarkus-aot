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

FILE="reports/$1-cpu"
JFR_FILE="${FILE}.jfr"
REPORT_FILE="${FILE}.html"
REPORT_FILE_REVERSE="${FILE}-reverse.html"

mkdir -p reports

if [ -f "$REPORT_FILE" ]; then
    echo "Error: File '$REPORT_FILE' already exists"
    exit 1
fi

./mvnw clean verify -Dquarkus.package.jar.type=aot-jar -Dquarkus.package.jar.appcds.use-aot=true -DskipITs=false

pushd target
java -agentpath:${PATH_TO_ASYNC_PROFILER}/lib/libasyncProfiler.so=start,event=cpu,interval=1,timeout=2,simple,file=../$JFR_FILE -XX:AOTCache=quarkus-app/app.aot -jar quarkus-app/quarkus-run.jar &
PID=$!
sleep 5
kill $PID
sleep 8
popd

"${PATH_TO_ASYNC_PROFILER}/bin/jfrconv" "$JFR_FILE" --cpu --exclude "(__syscall_cancel_arch)|(.*::.*)" "${REPORT_FILE}"
"${PATH_TO_ASYNC_PROFILER}/bin/jfrconv" "$JFR_FILE" --cpu --exclude "(__syscall_cancel_arch)|(.*::.*)" --reverse "${REPORT_FILE_REVERSE}"

echo "Profile written to: ${REPORT_FILE}"
echo "Reverse profile written to: ${REPORT_FILE_REVERSE}"

xdg-open "${REPORT_FILE}"
xdg-open "${REPORT_FILE_REVERSE}"
