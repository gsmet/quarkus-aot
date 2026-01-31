package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint585.schema.Schema585;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint585ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint585/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema585.class);
        assertEquals(1, actual.id());
        assertEquals("Entity585 n°1", actual.value());
    }
}
