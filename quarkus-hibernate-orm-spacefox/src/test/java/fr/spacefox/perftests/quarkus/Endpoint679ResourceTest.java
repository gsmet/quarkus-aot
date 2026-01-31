package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint679.schema.Schema679;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint679ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint679/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema679.class);
        assertEquals(1, actual.id());
        assertEquals("Entity679 n°1", actual.value());
    }
}
