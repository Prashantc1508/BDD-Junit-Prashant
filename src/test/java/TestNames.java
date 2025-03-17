import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class TestNames {

    public static void main(String[] args){


        WebDriver driver = new ChromeDriver();

       // driver.get("https://qa-practice.netlify.app/dynamic-table");

        /*List<WebElement> patientList = driver.findElements(By.xpath("//tbody[@id='data-tbody']//tr"));
        int size = patientList.size();

        List<Integer> patientAgeList = new ArrayList<>();

        for (int i=0;i<size;i++){
            String patientAge = driver.findElement(By.xpath("(//tbody[@id='data-tbody']//tr)["+i+"]//td[4]")).getText();
            int newPatientAge = Integer.parseInt(patientAge);
            patientAgeList.add(newPatientAge);
        }

        System.out.println();

        Collections.sort(patientAgeList);

        // get the first name and age and print it

        List<WebElement> newPatientList = driver.findElements(By.xpath("(//tbody[@id='data-tbody']//tr)"));

        for (int i=0; i<newPatientList.size();i++){
            driver.findElement(By.xpath("(//tbody[@id='data-tbody']//tr)[1]//td[2]")).getText();

        }*/

        // shubham

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        List<WebElement> nameList = driver.findElements(By.xpath("//div[@class='tableFixHead']//tbody//tr"));
        for (int i=0;i<nameList.size();i++){
            String name  = driver.findElement(By.xpath("(//div[@class='tableFixHead']//tbody//tr)["+i+"]//td[1]")).getText();
            System.out.println(name);
        }

    }
}
