package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint771.schema.Schema771;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint771ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint771/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema771.class);
        assertEquals(1, actual.id());
        assertEquals("Entity771 n°1", actual.value());
    }
}
