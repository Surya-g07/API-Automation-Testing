package models;

public class Booking {

    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private BookingDates bookingdates;
    private String additionalneeds;

    
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    // Getter & Setter for lastname
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    // Getter & Setter for totalprice
    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    //Getter and setter for depositpaid 
    public boolean isDepositpaid(){
        return depositpaid;
    }

    public void setDepositpaid(boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    // Getter and Setter for bookingdates
    public BookingDates getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(BookingDates bookingdates) {
        this.bookingdates = bookingdates;
    }

    // Getter and Setter for additionalneeds. This is an optional field in the API, so we can leave it as null.
    //(For Deserialization test case we fetch the additonal need.)

    public void setAdditionalneeds(String additionalneeds){
        this.additionalneeds = additionalneeds;
    }
    public String getAdditionalneeds(){
        return additionalneeds;
    }
}

// This sample data is pass to the test class and also indirectly use it as a payload.
