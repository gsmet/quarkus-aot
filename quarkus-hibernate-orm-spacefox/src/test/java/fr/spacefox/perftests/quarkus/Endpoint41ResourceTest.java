package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint41.schema.Schema41;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint41ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint41/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema41.class);
        assertEquals(1, actual.id());
        assertEquals("Entity41 n°1", actual.value());
    }
}
