package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint861.schema.Schema861;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint861ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint861/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema861.class);
        assertEquals(1, actual.id());
        assertEquals("Entity861 n°1", actual.value());
    }
}
