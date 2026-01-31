package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint39.schema.Schema39;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint39ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint39/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema39.class);
        assertEquals(1, actual.id());
        assertEquals("Entity39 n°1", actual.value());
    }
}
