package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint177.schema.Schema177;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint177ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint177/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema177.class);
        assertEquals(1, actual.id());
        assertEquals("Entity177 n°1", actual.value());
    }
}
