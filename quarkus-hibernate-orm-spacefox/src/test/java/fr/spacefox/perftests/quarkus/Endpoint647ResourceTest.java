package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint647.schema.Schema647;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint647ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint647/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema647.class);
        assertEquals(1, actual.id());
        assertEquals("Entity647 n°1", actual.value());
    }
}
