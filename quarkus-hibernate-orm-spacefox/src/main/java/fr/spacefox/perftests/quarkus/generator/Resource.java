package fr.spacefox.perftests.quarkus.generator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public record Resource(int id) {
    private static final String SCHEMA_TEMPLATE =
            """
            package %s;

            public record Schema%d(Long id, String value) {}
            """;
    private static final String RESOURCE_TEMPLATE =
            """
            package %s;

            import fr.spacefox.perftests.quarkus.core.service%d.Service%d;
            import fr.spacefox.perftests.quarkus.rest.endpoint%d.schema.Schema%d;
            import io.smallrye.common.annotation.RunOnVirtualThread;
            import jakarta.ws.rs.GET;
            import jakarta.ws.rs.Path;
            import jakarta.ws.rs.PathParam;
            import jakarta.ws.rs.Produces;
            import jakarta.ws.rs.core.MediaType;

            @RunOnVirtualThread
            @Path("/endpoint%d")
            public class Endpoint%dResource {

                private final Service%d service;

                public Endpoint%dResource(Service%d service) {
                    this.service = service;
                }

                @GET
                @Path("/{id}")
                @Produces(MediaType.APPLICATION_JSON)
                public Schema%d getById(@PathParam("id") Long id) {
                    return Mapper.of(service.compute(id));
                }
            }
            """;
    private static final String MAPPER_TEMPLATE =
            """
            package %s;

            import fr.spacefox.perftests.quarkus.core.service%d.model.Model%d;
            import fr.spacefox.perftests.quarkus.rest.endpoint%d.schema.Schema%d;

            final class Mapper {
                private Mapper() {}

                public static Schema%d of(Model%d model) {
                    return new Schema%d(model.id(), model.value());
                }
            }
            """;

    private static final String TEST_TEMPLATE =
            """
            package %s;

            import fr.spacefox.perftests.quarkus.rest.endpoint%d.schema.Schema%d;
            import io.quarkus.test.junit.QuarkusTest;
            import org.junit.jupiter.api.Test;

            import static io.restassured.RestAssured.given;
            import static org.junit.jupiter.api.Assertions.assertEquals;

            @QuarkusTest
            class Endpoint%dResourceTest {
                @Test
                void testHelloEndpoint() {
                    final var actual = given().with()
                            .pathParam("id", 1)
                            .when()
                            .get("/endpoint%d/{id}")
                            .then()
                            .statusCode(200)
                            .extract()
                            .body()
                            .as(Schema%d.class);
                    assertEquals(1, actual.id());
                    assertEquals("Entity%d n°1", actual.value());
                }
            }
            """;

    public void writeFiles() throws IOException {
        final var schemaPackageName = "fr.spacefox.perftests.quarkus.rest.endpoint%d.schema".formatted(id);
        final var schemaPackagePath = Generator.validAbsolutePath(schemaPackageName);
        Files.writeString(
                Path.of(schemaPackagePath, "Schema" + id + ".java"), SCHEMA_TEMPLATE.formatted(schemaPackageName, id));

        final var packageName = "fr.spacefox.perftests.quarkus.rest.endpoint%d".formatted(id);
        final var packagePath = Generator.validAbsolutePath(packageName);
        Files.writeString(
                Path.of(packagePath, "Endpoint" + id + "Resource.java"),
                RESOURCE_TEMPLATE.formatted(packageName, id, id, id, id, id, id, id, id, id, id));
        Files.writeString(
                Path.of(packagePath, "Mapper.java"),
                MAPPER_TEMPLATE.formatted(packageName, id, id, id, id, id, id, id));

        final var testPackageName = "fr.spacefox.perftests.quarkus";
        final var testPackagePath = Generator.validAbsoluteTestPath(testPackageName);
        Files.writeString(
                Path.of(testPackagePath, "Endpoint" + id + "ResourceTest.java"),
                TEST_TEMPLATE.formatted(testPackageName, id, id, id, id, id, id));
    }
}
