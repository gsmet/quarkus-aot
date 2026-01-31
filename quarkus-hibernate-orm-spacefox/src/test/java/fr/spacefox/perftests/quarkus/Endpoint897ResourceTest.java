package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint897.schema.Schema897;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint897ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint897/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema897.class);
        assertEquals(1, actual.id());
        assertEquals("Entity897 n°1", actual.value());
    }
}
