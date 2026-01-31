package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint244.schema.Schema244;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint244ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint244/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema244.class);
        assertEquals(1, actual.id());
        assertEquals("Entity244 n°1", actual.value());
    }
}
