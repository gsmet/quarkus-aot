package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint750.schema.Schema750;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint750ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint750/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema750.class);
        assertEquals(1, actual.id());
        assertEquals("Entity750 n°1", actual.value());
    }
}
