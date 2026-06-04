package tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class HealthcheckTest extends base.BaseTest {
    @Test
    public void healthCheck(){
        System.out.println("All Logs");
        RestAssured.given()
        .when()
        .get("/ping")
        .then()
        .log().all()
        .statusCode(201);
    }
}
