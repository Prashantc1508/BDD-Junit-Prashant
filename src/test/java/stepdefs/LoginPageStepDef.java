package stepdefs;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;

public class LoginPageStepDef {
    LoginPage loginPage  = new LoginPage(DriverFactory.driver);

    @Given("User on the Amazon website Login page")
    public void user_On_Amazon_website_loginPage() {
        System.out.println("Prashant Chaudhary");
        loginPage.openURL();
    }

    @Given("User enters the username {string}")
    public void user_Enters_UserName(String userName) {
        loginPage.user_Enters_UserName(userName);
    }

    @Given("User enters the password {string}")
    public void user_Enters_Password(String userPassword) {
        loginPage.user_Enters_Password(userPassword);
    }

    @And("User click on login button")
    public void user_On_Login_Button() {
        loginPage.user_On_Login_Button();
    }

    @Then("Validates user is on homepage {string}")
    public void validate_User_Is_On_Home_Page(String expectedData) {
        String actualData = loginPage.validate_User_Is_On_Home_Page();
        Assert.assertEquals("Actual data is not matched with Expected data",actualData, expectedData );
    }
}
