package MyHooks;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utility.ConfigReader;

import java.util.Properties;

public class AmazonHooks {

    ConfigReader configReader;
    Properties prop;
    DriverFactory driverfactory;
    static WebDriver driver;

    @Before(order = 0)
    public void getProperty() {
        System.out.println(" Before 1 st done!!!!!!!!!!!");
        configReader = new ConfigReader();
        prop = configReader.init_prop();
    }

    @Before(order = 1)
    public void launchBrowser() {
        System.out.println(" Before 2 st done!!!!!!!!!!!");
        String browserValue = prop.getProperty("browser");
        //driverfactory = new DriverFactory();
        driver = DriverFactory.initialize_driver(browserValue);
    }

    @After(order = 0)
    public void quitBrowser(Scenario scenario) {
        if (scenario.isFailed()) {
            //take screenshot
            String scenarioName = scenario.getName().replaceAll(" ", "_");
            byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sourcePath, "image/png", scenarioName);
        }
        System.out.println(" Before 3 st done!!!!!!!!!!!");
        driver.quit();
    }
}