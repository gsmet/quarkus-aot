package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint185.schema.Schema185;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint185ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint185/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema185.class);
        assertEquals(1, actual.id());
        assertEquals("Entity185 n°1", actual.value());
    }
}
