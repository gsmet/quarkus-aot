package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint297.schema.Schema297;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint297ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint297/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema297.class);
        assertEquals(1, actual.id());
        assertEquals("Entity297 n°1", actual.value());
    }
}
