package lesson_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\project\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // 1. Amazon ana sayfasina gidelim . https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        // 2. Youtube sayfasina gidelim. https://www.youtube.com/
        driver.navigate().to("https://www.youtube.com/");
        // 3. Tekrar Amazon sayfasina donelim
        driver.navigate().back();
        // 4. Yeniden Youtube sayfasina gidelim
        Thread.sleep(5000);
        driver.navigate().forward();
        // 5. Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();
        // 6. Sayfayi kapatalim

        driver.close();
    }

}
