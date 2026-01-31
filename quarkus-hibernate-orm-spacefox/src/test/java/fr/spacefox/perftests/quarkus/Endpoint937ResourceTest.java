package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint937.schema.Schema937;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint937ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint937/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema937.class);
        assertEquals(1, actual.id());
        assertEquals("Entity937 n°1", actual.value());
    }
}
