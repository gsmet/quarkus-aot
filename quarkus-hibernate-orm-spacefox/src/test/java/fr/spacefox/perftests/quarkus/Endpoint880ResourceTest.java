package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint880.schema.Schema880;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint880ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint880/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema880.class);
        assertEquals(1, actual.id());
        assertEquals("Entity880 n°1", actual.value());
    }
}
