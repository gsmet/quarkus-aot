package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint737.schema.Schema737;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint737ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint737/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema737.class);
        assertEquals(1, actual.id());
        assertEquals("Entity737 n°1", actual.value());
    }
}
