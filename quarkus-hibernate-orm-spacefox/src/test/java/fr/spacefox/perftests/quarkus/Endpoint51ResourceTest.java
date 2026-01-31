package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint51.schema.Schema51;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint51ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint51/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema51.class);
        assertEquals(1, actual.id());
        assertEquals("Entity51 n°1", actual.value());
    }
}
