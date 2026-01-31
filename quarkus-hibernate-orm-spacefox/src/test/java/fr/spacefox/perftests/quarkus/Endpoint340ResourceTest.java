package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint340.schema.Schema340;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint340ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint340/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema340.class);
        assertEquals(1, actual.id());
        assertEquals("Entity340 n°1", actual.value());
    }
}
