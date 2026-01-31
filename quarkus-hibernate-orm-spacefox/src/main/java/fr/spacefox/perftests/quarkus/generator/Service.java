package fr.spacefox.perftests.quarkus.generator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

record Service(int id) {
    private static final String MODEL_TEMPLATE =
            """
            package %s;

            public record Model%d(Long id, String value) {}
            """;
    private static final String SERVICE_TEMPLATE =
            """
            package %s;

            import fr.spacefox.perftests.quarkus.core.port.data.Entity%dDatasourcePort;
            import fr.spacefox.perftests.quarkus.core.service%d.model.Model%d;
            import io.smallrye.common.annotation.RunOnVirtualThread;
            import jakarta.enterprise.context.ApplicationScoped;

            @ApplicationScoped
            @RunOnVirtualThread
            public class Service%d {

                private final Entity%dDatasourcePort datasource;

                public Service%d(Entity%dDatasourcePort datasource) {
                    this.datasource = datasource;
                }

                public Model%d compute(Long id) {
                    return datasource.find(id).orElseThrow();
                }
            }
            """;

    public void writeFiles() throws IOException {
        final var modelPackageName = "fr.spacefox.perftests.quarkus.core.service%d.model".formatted(id);
        final var modelPackagePath = Generator.validAbsolutePath(modelPackageName);
        Files.writeString(
                Path.of(modelPackagePath, "Model" + id + ".java"), MODEL_TEMPLATE.formatted(modelPackageName, id));

        final var packageName = "fr.spacefox.perftests.quarkus.core.service%d".formatted(id);
        final var packagePath = Generator.validAbsolutePath(packageName);
        Files.writeString(
                Path.of(packagePath, "Service" + id + ".java"),
                SERVICE_TEMPLATE.formatted(packageName, id, id, id, id, id, id, id, id));
    }
}
