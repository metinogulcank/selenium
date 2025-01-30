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

        // Sayfanın başlığını getirir.
        System.out.println(driver.getTitle());

        // Sayfanın bütün HTML Kodunu getirir.
        System.out.println(driver.getPageSource());

        // Tarayıcıda açık olan sekmenin unique değerini bize verir. Her açılıp kapandığında farklı değerler döner
        System.out.println(driver.getWindowHandle());

        // Driver'ın hangi class'da olduğunu bize döner (org.openqa.selenium.chrome.ChromeDriver)
        System.out.println(driver.getClass());


    }
}
