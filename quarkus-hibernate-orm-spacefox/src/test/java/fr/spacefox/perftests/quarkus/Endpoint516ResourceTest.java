package fr.spacefox.perftests.quarkus;

import fr.spacefox.perftests.quarkus.rest.endpoint516.schema.Schema516;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class Endpoint516ResourceTest {
    @Test
    void testHelloEndpoint() {
        final var actual = given().with()
                .pathParam("id", 1)
                .when()
                .get("/endpoint516/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Schema516.class);
        assertEquals(1, actual.id());
        assertEquals("Entity516 n°1", actual.value());
    }
}
