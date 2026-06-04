package tests;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class DeleteTest extends base.BaseTest {

    @Test
    public void deleteTest(){

        RestAssured.given()
            .cookie("token", token)

        .when()
            .delete("/booking/1")

        .then()
            .statusCode(201)
            .log().all();
    }
}