package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint79.schema.Schema79;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint79ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint79/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema79.class);
        assertEquals(1, actual.id());
        assertEquals("Entity79 n°1", actual.value());
    }
}
