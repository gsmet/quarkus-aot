package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint486.schema.Schema486;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint486ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint486/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema486.class);
        assertEquals(1, actual.id());
        assertEquals("Entity486 n°1", actual.value());
    }
}
