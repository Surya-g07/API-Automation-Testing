package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetTest extends BaseTest {

    @Test
    public void getMethod(){

        Response r = RestAssured.given()

        .when()
            .get("/booking/10");
        r.then()
        .statusCode(200);
        
        // Sample data for response;
        System.out.println("Firstname: " + r.jsonPath().getString("firstname"));
        System.out.println("Lastname: " + r.jsonPath().getString("lastname"));
        System.out.println("Totalprice: " + r.jsonPath().getString("totalprice"));
    }
}
