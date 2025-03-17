package pages;

import factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends DriverFactory {

    private WebDriver driver;
    private By usernameemail = By.xpath("//input[@name='email']");
    private By userNamePassword = By.xpath("//input[@id='input-password']");
    private By loginButton = By.xpath("//input[@type='submit']");
    private By homePage = By.xpath("//div[@id='content']//h2[1]");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openURL(){
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
    }

    public void user_Enters_UserName(String actualEmail) {
        driver.findElement(usernameemail).sendKeys(actualEmail);
    }

    public void user_Enters_Password(String actualPassword) {
        driver.findElement(userNamePassword).sendKeys(actualPassword);
    }

    public void user_On_Login_Button() {
        driver.findElement(loginButton).click();
    }

    public String validate_User_Is_On_Home_Page() {
        String actualText = driver.findElement(homePage).getText();
        return actualText;
    }

}
