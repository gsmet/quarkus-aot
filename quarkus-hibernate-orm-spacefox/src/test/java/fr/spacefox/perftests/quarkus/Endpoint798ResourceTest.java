package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint798.schema.Schema798;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint798ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint798/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema798.class);
        assertEquals(1, actual.id());
        assertEquals("Entity798 n°1", actual.value());
    }
}
