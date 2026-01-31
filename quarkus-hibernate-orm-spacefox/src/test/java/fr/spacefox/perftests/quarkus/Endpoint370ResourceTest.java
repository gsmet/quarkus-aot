package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint370.schema.Schema370;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint370ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint370/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema370.class);
        assertEquals(1, actual.id());
        assertEquals("Entity370 n°1", actual.value());
    }
}
