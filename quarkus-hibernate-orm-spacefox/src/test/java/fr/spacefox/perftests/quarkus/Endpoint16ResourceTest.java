package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint16.schema.Schema16;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint16ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint16/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema16.class);
        assertEquals(1, actual.id());
        assertEquals("Entity16 n°1", actual.value());
    }
}
