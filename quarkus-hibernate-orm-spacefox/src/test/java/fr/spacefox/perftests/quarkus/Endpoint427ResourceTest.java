package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint427.schema.Schema427;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint427ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint427/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema427.class);
        assertEquals(1, actual.id());
        assertEquals("Entity427 n°1", actual.value());
    }
}
