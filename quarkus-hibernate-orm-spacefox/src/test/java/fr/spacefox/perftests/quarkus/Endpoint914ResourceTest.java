package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint914.schema.Schema914;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint914ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint914/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema914.class);
        assertEquals(1, actual.id());
        assertEquals("Entity914 n°1", actual.value());
    }
}
