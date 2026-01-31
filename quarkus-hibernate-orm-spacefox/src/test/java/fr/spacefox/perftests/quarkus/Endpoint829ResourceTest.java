package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint829.schema.Schema829;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint829ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint829/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema829.class);
        assertEquals(1, actual.id());
        assertEquals("Entity829 n°1", actual.value());
    }
}
