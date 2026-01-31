package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint561.schema.Schema561;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint561ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint561/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema561.class);
        assertEquals(1, actual.id());
        assertEquals("Entity561 n°1", actual.value());
    }
}
