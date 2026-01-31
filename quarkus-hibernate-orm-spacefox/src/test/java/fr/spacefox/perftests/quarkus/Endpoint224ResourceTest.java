package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint224.schema.Schema224;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint224ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint224/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema224.class);
        assertEquals(1, actual.id());
        assertEquals("Entity224 n°1", actual.value());
    }
}
