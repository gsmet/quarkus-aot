package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint661.schema.Schema661;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint661ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint661/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema661.class);
        assertEquals(1, actual.id());
        assertEquals("Entity661 n°1", actual.value());
    }
}
