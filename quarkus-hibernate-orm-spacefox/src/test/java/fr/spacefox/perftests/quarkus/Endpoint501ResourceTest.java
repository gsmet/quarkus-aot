package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint501.schema.Schema501;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint501ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint501/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema501.class);
        assertEquals(1, actual.id());
        assertEquals("Entity501 n°1", actual.value());
    }
}
