package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
import models.Booking;

public class DeserializationTest extends base.BaseTest {
    @Test
    public void getBooking(){
        Response response = given()

        .when()
        
            .get("/booking/10");
        response.then()
            .log().all();
        
        System.out.println(response.statusCode());

        Booking booking = response.as(Booking.class);

        System.out.println(booking.getFirstname());
        System.out.println(booking.getLastname());
        System.out.println(booking.getTotalprice());
        System.out.println(booking.isDepositpaid());
        System.out.println(booking.getBookingdates());
        System.out.println(booking.getAdditionalneeds());
    }
}

// In this test case we are converting the response into Java Object and then we are fetching the values from that object.