package lesson_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_01 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\project\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https:\\www.amazon.com");

        System.out.println(driver.getTitle());
        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title Testi Başarılı");
        } else{
            System.out.println("Title Testi Başarısız");
        }

        System.out.println(driver.getTitle());
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "amazon";

        if (actualUrl.contains(expectedUrl)){
            System.out.println("URL Testi Başarılı");
        } else{
            System.out.println("URL Testi Başarısız");
        }

        System.out.println(driver.getWindowHandle());

        String actualSource = driver.getPageSource();
        String expectedSource = "shopping";

        if (actualSource.contains(expectedSource)){
            System.out.println("Source Testi Başarılı");
        } else{
            System.out.println("Source Testi Başarısız");
        }
        Thread.sleep(2000);
        driver.close();


    }

}
