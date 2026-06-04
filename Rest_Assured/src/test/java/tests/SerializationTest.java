package tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import models.Booking;
import models.BookingDates;

public class SerializationTest extends base.BaseTest {

    @Test
    public void createBooking(){

        // Create Java Object
        Booking booking = new Booking();

        booking.setFirstname("Sethu");
        booking.setLastname("Kumar");
        booking.setTotalprice(1000);
        booking.setDepositpaid(true);
        BookingDates bkd = new BookingDates();
        bkd.setCheckin("2026-01-01");
        bkd.setCheckout("2026-01-10");
        booking.setBookingdates(bkd);

        // Send object directly
        RestAssured.given()
            .log().body()
            .contentType("application/json")
            .body(booking)

        .when()
            .post("/booking")

        .then()
            .log().all()
            .statusCode(200);
    }
}

//For this test case we need to give all the inputs for POST method because of the site requirement.
