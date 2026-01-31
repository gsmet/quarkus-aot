package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint543.schema.Schema543;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint543ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint543/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema543.class);
        assertEquals(1, actual.id());
        assertEquals("Entity543 n°1", actual.value());
    }
}
