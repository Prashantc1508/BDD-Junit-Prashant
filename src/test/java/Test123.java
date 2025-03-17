import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import java.time.Duration;

public class Test123 {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.get("https://www.google.co.in/");
        driver.findElement(By.xpath("")).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
        element.click();

        RestAssured.baseURI = "";

        // Get Request
        String response = given().header("ContentType","application JSON").body("")
                .when().get("resource uri")
                .then().extract().response().asString();

        JsonObject json2 = JsonParser.parseString(response.getBytes().toString()).getAsJsonObject();
        json2.getAsJsonArray().getAsJsonObject().getAsJsonArray().getAsJsonObject().get("");
        JsonPath json1  = new JsonPath(response);
        json1.get("");

        // post

        String responsePost = given().header("Authorization","bearer token").body("")
                .when().post("resource URI")
                .then().assertThat().statusCode(201).extract().response().asString();

        // put

        String responsePut = given().cookie("","").header("","").body("")
                .when().put()
                .then().assertThat().statusCode(200).extract().response().asString();

        // json schema validation
        /*given().body("")
                .when().get("")
                .then().assertThat().statusCode(200).body(matchesJsonSchemaInClasspath("text.json"))*/
    }
}
