package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint238.schema.Schema238;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint238ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint238/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema238.class);
        assertEquals(1, actual.id());
        assertEquals("Entity238 n°1", actual.value());
    }
}
