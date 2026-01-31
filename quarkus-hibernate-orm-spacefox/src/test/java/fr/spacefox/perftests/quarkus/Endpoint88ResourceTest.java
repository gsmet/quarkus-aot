package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint88.schema.Schema88;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint88ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint88/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema88.class);
        assertEquals(1, actual.id());
        assertEquals("Entity88 n°1", actual.value());
    }
}
