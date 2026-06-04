package tests;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;
 
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
 
public class BookingFlowTest extends base.BaseTest {
        
    @Test
    public void createAndGetBooking() {
 
        String requestBody = "{\n" +
                "  \"firstname\": \"Sethu\",\n" +
                "  \"lastname\": \"Kumar\",\n" +
                "  \"totalprice\": 1000,\n" +
                "  \"depositpaid\": true,\n" +
                "  \"bookingdates\": {\n" +
                "    \"checkin\": \"2024-01-01\",\n" +
                "    \"checkout\": \"2024-01-05\"\n" +
                "  }\n" +
                "}";
 
        // Step 1: POST → create booking
        int bookingId = given()
                .contentType("application/json")
                .body(requestBody)
 
        .when()
                .post("/booking")

        .then()
                .statusCode(200)
                .extract()
                .path("bookingid");

        System.out.println("Created Booking ID: " + bookingId);

        // Step 2: GET → use same id
        RestAssured.given()

        .when()
                .get("/booking/" + bookingId)

        .then()
                .statusCode(200)
                .log().all()
                .body("firstname", equalTo("Sethu"));

        System.out.println("Created Booking retrieved");


        //delete the created booking

        RestAssured.given()
        .cookie("token", token)

        .when()
                .delete("/booking/" + bookingId)

        .then()
                .statusCode(201);

                System.out.println("Booking deleted");
        // Verify deletion by trying to GET the deleted booking
        RestAssured.given()
        .when().get("/booking/"+bookingId)
        .then()
        .statusCode(404);
    }
}