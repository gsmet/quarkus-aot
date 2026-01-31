package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint35.schema.Schema35;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint35ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint35/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema35.class);
        assertEquals(1, actual.id());
        assertEquals("Entity35 n°1", actual.value());
    }
}
