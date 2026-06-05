    package tests;

    import static org.hamcrest.Matchers.equalTo;
    import org.testng.annotations.Test;

    import io.restassured.RestAssured;
    import io.restassured.response.Response;

    public class UpdateTest extends base.BaseTest{
        private int bookingId = 0;
        @Test
        public void createBooking(){
            Response r = RestAssured.given()
            .contentType("application/json")
            .body("{\n" +
                    "  \"firstname\": \"Steve\",\n" +
                    "  \"lastname\": \"Smith\",\n" +
                    "  \"totalprice\": 1000,\n" +
                    "  \"depositpaid\": true,\n" +
                    "  \"bookingdates\": {\n" +
                    "    \"checkin\": \"2024-01-01\",\n" +
                    "    \"checkout\": \"2024-01-05\"\n" +
                    "  }\n" +
                    "}")
            .when()
                .post("/booking");
            r.then()
                .statusCode(200);

            bookingId = r.jsonPath().getInt("bookingid");
            System.out.println(bookingId);
            
            System.out.println(r.asPrettyString());
        }

    @Test(dependsOnMethods = "createBooking")
    public void updateBookingPATCH(){

        RestAssured.given()
            .cookie("token",token)
            .contentType("application/json")
            .body("{ \"firstname\": \"Surya\" }")

        .when()
            .patch("/booking/" + bookingId)

        .then()
            .statusCode(200)
            .body("firstname", equalTo("Surya"));

            
        Response r = RestAssured.given()
        .when()
            .get("/booking/" + bookingId);
        r.then()
        .statusCode(200);
        System.out.println(r.jsonPath().getString("firstname"));
        }
    }
