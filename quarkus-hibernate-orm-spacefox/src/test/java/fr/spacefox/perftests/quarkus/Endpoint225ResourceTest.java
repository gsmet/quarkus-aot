package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint225.schema.Schema225;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint225ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint225/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema225.class);
        assertEquals(1, actual.id());
        assertEquals("Entity225 n°1", actual.value());
    }
}
