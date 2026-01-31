package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint155.schema.Schema155;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint155ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint155/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema155.class);
        assertEquals(1, actual.id());
        assertEquals("Entity155 n°1", actual.value());
    }
}
