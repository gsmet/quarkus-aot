package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint893.schema.Schema893;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint893ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint893/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema893.class);
        assertEquals(1, actual.id());
        assertEquals("Entity893 n°1", actual.value());
    }
}
