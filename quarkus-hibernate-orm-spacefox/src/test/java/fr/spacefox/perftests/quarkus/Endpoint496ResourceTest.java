package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint496.schema.Schema496;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint496ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint496/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema496.class);
        assertEquals(1, actual.id());
        assertEquals("Entity496 n°1", actual.value());
    }
}
