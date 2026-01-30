# Quarkus REST sample application for AOT

This is a very simple REST app that allows to test the Quarkus initialization with AOT.

> [!TIP]
> You need Quarkus `main` branch locally deployed as this project uses `999-SNAPSHOT` and features that are only in `main`.

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
