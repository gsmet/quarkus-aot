# Quarkus - Tribe KRD for AOT

This is an application using Hibernate ORM, with scripts to generate profiling data for AOT builds.

The applications is based on https://github.com/topicusonderwijs/tribe-krd-quarkus/, thus its name.

The application is large, so building it and profiling it takes time, be patient,
the profiles will be loaded in your favorite browser as soon as they are generated.

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

----------

## Original README.md

Using the entity model from [Tribe KRD][tribe-krd], cleaning it up so
it will work in a modern Hibernate and Quarkus application and
relicensing it to [Apache-2.0][apache], this project is an ideal candidate to
benchmark Hibernate startup times using an actual business model.

The original Tribe KRD project was part of the [acquisition of Eduarte by Topicus][acquisition],
so all rights to this project were transferred to Topicus Onderwijs Eduarte
B.V., allowing us to relincense the project to Apache-2.0.

It features 300+ entities that are linked together. It models part of a
student information system for Dutch trade schools (or vocational colleges).

This project doesn't feature any services or implementations, but merely uses
the entity model for benchmarking quarkus startup times using a realistic 
entity model.

## License

```
Copyright 2022 Topicus Onderwijs Eduarte B.V.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   [http://www.apache.org/licenses/LICENSE-2.0][apache]

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

## Configuration

As this is a normal quarkus project, you can find the configuration in
`src/main/resources/application.properties`

By default it is configured to use an in-memory H2 database.

## Startup

Use `mvn quarkus:dev` to start up the server and direct your browser
to [http://localhost:8080/hello](http://localhost:8080/hello) to retrieve 
the hello message.

## Reloading code changes

When you change the code in `org.acme.GreetingResource` and refresh the
browser window, Quarkus should restart the application and load the Hibernate
model anew. As this is a medium sized entity model (300+ entities) restarts
will be noticable (unless the Hibernate devs are able to enhance startup times
further).

On my machine a reload takes about 4 seconds.

[tribe-krd]: https://github.com/topicusonderwijs/tribe-krd-opensource
[apache]: http://www.apache.org/licenses/LICENSE-2.0
[acquisition]: https://topicus.nl/nieuws-en-kennis/topicus-studentinformatiesysteem-eduarte-iddink-group
