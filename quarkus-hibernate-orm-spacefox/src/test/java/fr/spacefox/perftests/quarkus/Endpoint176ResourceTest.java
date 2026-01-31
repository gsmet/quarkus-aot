package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint176.schema.Schema176;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint176ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint176/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema176.class);
        assertEquals(1, actual.id());
        assertEquals("Entity176 n°1", actual.value());
    }
}
