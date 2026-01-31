package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint348.schema.Schema348;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint348ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint348/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema348.class);
        assertEquals(1, actual.id());
        assertEquals("Entity348 n°1", actual.value());
    }
}
