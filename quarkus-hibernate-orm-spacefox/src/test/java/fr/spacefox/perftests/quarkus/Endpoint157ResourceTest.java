package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint157.schema.Schema157;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint157ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint157/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema157.class);
        assertEquals(1, actual.id());
        assertEquals("Entity157 n°1", actual.value());
    }
}
