package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint699.schema.Schema699;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint699ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint699/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema699.class);
        assertEquals(1, actual.id());
        assertEquals("Entity699 n°1", actual.value());
    }
}
