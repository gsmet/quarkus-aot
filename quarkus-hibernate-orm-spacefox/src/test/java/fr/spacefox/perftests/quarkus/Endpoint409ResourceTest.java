package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint409.schema.Schema409;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint409ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint409/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema409.class);
        assertEquals(1, actual.id());
        assertEquals("Entity409 n°1", actual.value());
    }
}
