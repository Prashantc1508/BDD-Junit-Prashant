package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverFactory {

    public static WebDriver driver;

    public static WebDriver initialize_driver(String browser) {
        if (browser.equals("chrome")) {
            driver = getDriver();
        }
        else {
            System.out.println("Browser is not chrome");
        }
        return driver;
    }

    public static synchronized WebDriver  getDriver(){
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        return driver;
    }

}
