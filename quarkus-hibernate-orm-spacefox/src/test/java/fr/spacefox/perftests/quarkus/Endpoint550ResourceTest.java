package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint550.schema.Schema550;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint550ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint550/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema550.class);
        assertEquals(1, actual.id());
        assertEquals("Entity550 n°1", actual.value());
    }
}
