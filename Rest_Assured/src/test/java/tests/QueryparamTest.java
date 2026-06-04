package tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class QueryparamTest extends base.BaseTest{
    @Test

    public void invalidTest(){
        RestAssured.given().header("Content-Type","application/json")
        .queryParam("firstname", "Surya")
        .queryParam("lastname", "Kumar")
        .when().get("/booking")

        .then().log().all()
        .statusCode(200);
    }
}
