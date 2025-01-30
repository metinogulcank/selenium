package lesson_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\project\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com");

        By searchBox = By.id("search");
        WebElement searchBoxElement = driver.findElement(searchBox);

        WebElement searchBoxElement2 = driver.findElement(By.id("search"));

        By searchBoxName = By.id("search_query");
        WebElement searchBoxNameElement = driver.findElement(searchBoxName);

        WebElement searchBoxNameElement2 = driver.findElement(By.name("search_query"));

        By searchBoxClassName = By.id("ytd-search");
        WebElement searchBoxClassNameElement = driver.findElement(searchBoxClassName);

        WebElement searchBoxClassNameElement2 = driver.findElement(By.name("ytd-search"));

        By searchBoxLink = By.linkText("Forgotten Password?");
        WebElement searchBoxLinkElement = driver.findElement(searchBoxLink);

        WebElement searchBoxLinkElement2 = driver.findElement(By.linkText("Forgotton Password?"));


    }
}
