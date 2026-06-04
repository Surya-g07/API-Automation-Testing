package tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class NegativeTest extends base.BaseTest{
    @Test
    public void negativeTest(){
        RestAssured.given()
        .cookie("token", token)
        .when()
        .delete("/booking/10000")
        .then().log().all()
        .statusCode(405);
    }

    //Test case to check the response with  invalid token

    @Test
    public void invalidTokenTest(){
        RestAssured.given()
        .cookie("token","invalidtoken")
        .when()
        .delete("/booking/1")
        .then().statusCode(403);
    }

    @Test
    public void post(){
        //post with improper api doc requirements
       String requestBody = "{\n" +
                "  \"firstname\": \"Surya\",\n" +
                "  \"lastname\": \"G\",\n" +
                "  \"totalprice\": 1000,\n" +
                "  \"depositpaid\": true,\n" +
                "}";

        RestAssured.given()
            .contentType("application/json")
            .body(requestBody)
        .when()
        .post("/booking")
        .then()
        .statusCode(400);
    }
}
