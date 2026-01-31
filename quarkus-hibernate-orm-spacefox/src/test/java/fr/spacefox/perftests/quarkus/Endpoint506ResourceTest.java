package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint506.schema.Schema506;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint506ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint506/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema506.class);
        assertEquals(1, actual.id());
        assertEquals("Entity506 n°1", actual.value());
    }
}
