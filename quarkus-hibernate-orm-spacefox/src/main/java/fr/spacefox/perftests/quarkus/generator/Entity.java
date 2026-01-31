package fr.spacefox.perftests.quarkus.generator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

record Entity(int id) {
    private static final String ENTITY_TEMPLATE =
            """
            package %s;

            import jakarta.persistence.Entity;
            import jakarta.persistence.GeneratedValue;
            import jakarta.persistence.Id;

            @Entity
            public class Entity%d {
                @Id
                @GeneratedValue
                private Long id;

                private String field;

                public Long getId() {
                    return id;
                }

                public void setId(Long id) {
                    this.id = id;
                }

                public String getField() {
                    return field;
                }

                public void setField(String field) {
                    this.field = field;
                }
            }
            """;
    private static final String REPOSITORY_TEMPLATE =
            """
            package %s;

            import fr.spacefox.perftests.quarkus.core.port.data.Entity%dDatasourcePort;
            import fr.spacefox.perftests.quarkus.core.service%d.model.Model%d;
            import io.quarkus.hibernate.orm.panache.PanacheRepository;
            import io.smallrye.common.annotation.RunOnVirtualThread;
            import jakarta.enterprise.context.ApplicationScoped;
            import java.util.Optional;

            @ApplicationScoped
            @RunOnVirtualThread
            public class Entity%dRepository implements Entity%dDatasourcePort, PanacheRepository<Entity%d> {
                @Override
                public Optional<Model%d> find(Long id) {
                    return findByIdOptional(id).map(Mapper::of);
                }
            }
            """;
    private static final String MAPPER_TEMPLATE =
            """
            package %s;

            import fr.spacefox.perftests.quarkus.core.service%d.model.Model%d;

            final class Mapper {
                private Mapper() {}

                public static Model%d of(Entity%d entity) {
                    return new Model%d(entity.getId(), entity.getField());
                }
            }
            """;
    private static final String DATASOURCE_PORT_TEMPLATE =
            """
            package %s;

            import fr.spacefox.perftests.quarkus.core.service%d.model.Model%d;
            import java.util.Optional;

            public interface Entity%dDatasourcePort {
                Optional<Model%d> find(Long id);
            }
            """;

    public String name() {
        return "Entity" + id;
    }

    public String varName() {
        return "entity" + id;
    }

    public void writeFiles() throws IOException {

        final var packageName = "fr.spacefox.perftests.quarkus.data.entity%d".formatted(id);
        final var packagePath = Generator.validAbsolutePath(packageName);

        Files.writeString(Path.of(packagePath, name() + ".java"), ENTITY_TEMPLATE.formatted(packageName, id));
        Files.writeString(
                Path.of(packagePath, name() + "Repository.java"),
                REPOSITORY_TEMPLATE.formatted(packageName, id, id, id, id, id, id, id));
        Files.writeString(
                Path.of(packagePath, "Mapper.java"), MAPPER_TEMPLATE.formatted(packageName, id, id, id, id, id));

        final var dataPortPackageName = "fr.spacefox.perftests.quarkus.core.port.data";
        final var dataPortPackagePath = Generator.validAbsolutePath(dataPortPackageName);
        Files.writeString(
                Path.of(dataPortPackagePath, name() + "DatasourcePort.java"),
                DATASOURCE_PORT_TEMPLATE.formatted(dataPortPackageName, id, id, id, id));
    }
}
