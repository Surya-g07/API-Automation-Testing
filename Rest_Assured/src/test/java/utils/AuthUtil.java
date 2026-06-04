package utils;
import static io.restassured.RestAssured.given;

public class AuthUtil extends base.BaseTest {

    public static String getToken() {

        return given()
            .contentType("application/json")
            .body("{ \"username\": \"admin\", \"password\": \"password123\" }")

        .when()
            .post("/auth")

        .then()
            .extract()
            .path("token");
    }
}
