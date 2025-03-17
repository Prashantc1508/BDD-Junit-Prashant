package stepdefs.api;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageAPI.LoginPageAPI;
import pages.LoginPage;

public class StepDefAPI {
    LoginPageAPI loginPageAPI =  new LoginPageAPI();

    @Given("User get the booking id and validate the response")
    public void userGetTheResponseForBookingID() {
        loginPageAPI.getResponseBookingID();
    }

    @When("User create the bookingid")
    public void usePostTheResponseForBookingID() {
        loginPageAPI.postResponseBookingID();
    }

}
