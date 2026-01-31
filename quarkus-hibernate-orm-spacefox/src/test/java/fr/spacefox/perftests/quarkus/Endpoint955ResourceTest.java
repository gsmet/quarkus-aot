package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint955.schema.Schema955;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint955ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint955/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema955.class);
        assertEquals(1, actual.id());
        assertEquals("Entity955 n°1", actual.value());
    }
}
