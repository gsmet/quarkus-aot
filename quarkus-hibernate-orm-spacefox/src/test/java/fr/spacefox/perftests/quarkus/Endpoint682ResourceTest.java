package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint682.schema.Schema682;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint682ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint682/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema682.class);
        assertEquals(1, actual.id());
        assertEquals("Entity682 n°1", actual.value());
    }
}
