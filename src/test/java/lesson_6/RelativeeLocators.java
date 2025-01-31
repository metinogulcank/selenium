package lesson_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeeLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\project\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
        driver.manage().window().maximize();

        WebElement bostonElement = driver.findElement(By.id("pid6_thumb"));
        WebElement nycElement = driver.findElement(By.id("pid3_thumb"));
        WebElement bayAreaElement = driver.findElement(By.id("pid8_thumb"));
        WebElement sailorElement = driver.findElement(By.id("pid11_thumb"));

        WebElement berlinElement1 = driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(bostonElement));
        WebElement berlinElement2 = driver.findElement(RelativeLocator.with(By.id("pid7_thumb")).toLeftOf(bayAreaElement));
        WebElement berlinElement3 = driver.findElement(RelativeLocator.with(By.id("pid7_thumb")).below(nycElement));
        WebElement berlinElement4 = driver.findElement(RelativeLocator.with(By.xpath("(//img[@class=\'ui-li-thumb'])[7]")).above(sailorElement));

        String text1 = berlinElement1.getAttribute("id");
        String text2 = berlinElement2.getAttribute("id");
        String text3 = berlinElement3.getAttribute("id");
        String text4 = berlinElement4.getAttribute("id");

        if (text1.equals(text2) && text3.equals(text4)){
            System.out.println("Test PASSED");
        }
        driver.close();


    }
}
