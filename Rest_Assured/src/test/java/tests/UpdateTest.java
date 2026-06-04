package tests;

import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UpdateTest extends base.BaseTest{
    @Test
public void updateBookingPATCH(){

    RestAssured.given()
        .header("Authorization", "Bearer " + token)
        .contentType("application/json")
        .body("{ \"firstname\": \"Surya\" }")

    .when()
        .patch("/booking/1")

    .then()
        .statusCode(200)
        .body("firstname", equalTo("Surya"));

    RestAssured.given()
    .when()
        .get("/booking/1")
    .then()
    .statusCode(200)
    .body("firstname", equalTo("Surya"));
    }
}
