package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint197.schema.Schema197;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint197ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint197/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema197.class);
        assertEquals(1, actual.id());
        assertEquals("Entity197 n°1", actual.value());
    }
}
