package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint358.schema.Schema358;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint358ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint358/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema358.class);
        assertEquals(1, actual.id());
        assertEquals("Entity358 n°1", actual.value());
    }
}
