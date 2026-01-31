package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint669.schema.Schema669;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint669ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint669/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema669.class);
        assertEquals(1, actual.id());
        assertEquals("Entity669 n°1", actual.value());
    }
}
