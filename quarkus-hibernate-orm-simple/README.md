# Quarkus Hibernate ORM Simple App for AOT

This is an application using Hibernate ORM, with scripts to generate profiling data for AOT builds.

The application is extremely simple with only one entity.
The goal is to measure the Hibernate ORM overhead with a very small model.

> [!TIP]
> You need Quarkus `main` branch locally deployed as this project uses `999-SNAPSHOT` and features that are only in `main`.

You can easily generate various profiles by:

- Executing:

```
echo 1 | sudo tee /proc/sys/kernel/perf_event_paranoid
echo 0 | sudo tee /proc/sys/kernel/kptr_restrict
```

- Defining `PATH_TO_ASYNC_PROFILER`: `export PATH_TO_ASYNC_PROFILER=~/Downloads/async-profiler-4.2.1-linux-x64`
- Starting a PostgreSQL instance (for instance using `cd src/test/docker && podman compose up`)
- Starting the app one time in dev mode with `./mvnw quarkus:dev` to initialize the database
- Choosing a name for your profile: `my-experiment-1`
- Then calling the various scripts:
  - `./generate-cpu-profile-startup.sh my-experiment-1` to generate a CPU profile (both standard and reverse)
  - `./generate-alloc-profile-startup.sh my-experiment-1` to generate an allocation profile (both standard and reverse)
  - `./generate-wall-profile-startup.sh my-experiment-1` to generate a wall profile (both standard and reverse)

The profiles are generated in the `reports/` directory, with distinctive names.

Your browser should automatically open the profiles at the end of the script.
