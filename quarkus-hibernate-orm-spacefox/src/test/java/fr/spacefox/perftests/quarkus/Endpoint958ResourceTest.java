package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint958.schema.Schema958;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint958ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint958/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema958.class);
        assertEquals(1, actual.id());
        assertEquals("Entity958 n°1", actual.value());
    }
}
