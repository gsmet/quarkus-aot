package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint823.schema.Schema823;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint823ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint823/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema823.class);
        assertEquals(1, actual.id());
        assertEquals("Entity823 n°1", actual.value());
    }
}
