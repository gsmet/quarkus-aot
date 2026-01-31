package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint116.schema.Schema116;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint116ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint116/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema116.class);
        assertEquals(1, actual.id());
        assertEquals("Entity116 n°1", actual.value());
    }
}
