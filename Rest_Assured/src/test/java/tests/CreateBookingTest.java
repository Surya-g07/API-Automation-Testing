package tests;

import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreateBookingTest extends base.BaseTest{

    @Test
    public void createBooking() {

        String requestBody = "{\n" +
                "  \"firstname\": \"Surya\",\n" +
                "  \"lastname\": \"kumar\",\n" +
                "  \"totalprice\": 1000,\n" +
                "  \"depositpaid\": true,\n" +
                "  \"bookingdates\": {\n" +
                "    \"checkin\": \"2024-01-01\",\n" +
                "    \"checkout\": \"2024-01-05\"\n" +
                "  }\n" +
                "}";

        given()
            .contentType("application/json")
            .body(requestBody)

        .when()
            .post("/booking")

        .then()
            .statusCode(200)
            .log().all()
            .body("booking.firstname", equalTo("Surya"))
            .extract().path("bookingid");
    }
}
