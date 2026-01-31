package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint169.schema.Schema169;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint169ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint169/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema169.class);
        assertEquals(1, actual.id());
        assertEquals("Entity169 n°1", actual.value());
    }
}
