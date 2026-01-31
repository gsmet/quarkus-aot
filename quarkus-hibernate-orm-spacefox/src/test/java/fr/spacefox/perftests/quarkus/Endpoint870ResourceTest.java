package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint870.schema.Schema870;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint870ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint870/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema870.class);
        assertEquals(1, actual.id());
        assertEquals("Entity870 n°1", actual.value());
    }
}
