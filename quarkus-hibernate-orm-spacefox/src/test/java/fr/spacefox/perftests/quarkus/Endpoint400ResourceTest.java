package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint400.schema.Schema400;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint400ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint400/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema400.class);
        assertEquals(1, actual.id());
        assertEquals("Entity400 n°1", actual.value());
    }
}
