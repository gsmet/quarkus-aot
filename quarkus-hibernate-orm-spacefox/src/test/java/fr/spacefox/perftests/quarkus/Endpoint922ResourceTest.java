package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint922.schema.Schema922;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint922ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint922/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema922.class);
        assertEquals(1, actual.id());
        assertEquals("Entity922 n°1", actual.value());
    }
}
