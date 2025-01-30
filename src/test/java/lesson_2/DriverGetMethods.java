package lesson_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\project\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Belirtilen Url'i açar
        driver.get("https:\\www.amazon.com");

        // Aktif olan urlyi bize yazar
        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getTitle()); // Sayfanın başlığını getirir.
    }
}
