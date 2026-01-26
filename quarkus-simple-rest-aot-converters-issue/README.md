# Quarkus REST sample application for AOT

This is a very simple REST app that allows to test the Quarkus initialization with AOT.

It uses Quarkus 3.30.5 so that you can reproduce the issue with lambdas from `io.smallrye.config.Converters` not being included in the AOT cache.

## Building and running the app

```
# Build Quarkus and generate AOT cache from an IT
./mvnw clean verify -Dquarkus.package.jar.appcds.enabled=true -Dquarkus.package.jar.appcds.use-aot=true -DskipITs=false

# Go to target directory where the runner jar is
cd target

# Start the runner jar and provide the AOT cache
java -XX:AOTCache=app.aot -jar code-with-quarkus-1.0.0-SNAPSHOT-runner.jar
```

## Profiling

You can easily generate various profiles by:

- Executing:

```
echo 1 | sudo tee /proc/sys/kernel/perf_event_paranoid
echo 0 | sudo tee /proc/sys/kernel/kptr_restrict
```

- Defining `PATH_TO_ASYNC_PROFILER`: `export PATH_TO_ASYNC_PROFILER=~/Downloads/async-profiler-4.2.1-linux-x64`
- Choosing a name for your profile: `my-experiment-1`
- Then calling the various scripts:
  - `./generate-cpu-profile-startup.sh my-experiment-1` to generate a CPU profile (both standard and reverse)
  - `./generate-alloc-profile-startup.sh my-experiment-1` to generate an allocation profile (both standard and reverse)
  - `./generate-wall-profile-startup.sh my-experiment-1` to generate a wall profile (both standard and reverse)

The profiles are generated in the `reports/` directory, with distinctive names.

Your browser should automatically open the profiles at the end of the script.
