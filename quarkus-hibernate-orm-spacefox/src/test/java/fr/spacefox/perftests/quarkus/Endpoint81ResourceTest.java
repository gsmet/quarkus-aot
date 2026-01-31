package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint81.schema.Schema81;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint81ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint81/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema81.class);
        assertEquals(1, actual.id());
        assertEquals("Entity81 n°1", actual.value());
    }
}
