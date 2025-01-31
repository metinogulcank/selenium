package lesson_5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise_1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\project\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // https://www.amazon.com.tr/ URL git
        driver.get("https://www.amazon.com.tr");

        // Cerezleri kabul et
        driver.findElement(By.id("sp-cc-accept")).click();

        // Arama butonuna iphone 11 yaz ve arama işlemini yap
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 11", Keys.ENTER);

        // Arama sonucunun iphone 11 icerip icermedigini kontrol edin
        String expectedReslt = "iphone 11";
        String searchResult = driver.findElement(By.xpath("(//h2[@ class=\"a-size-base a-spacing-small a-spacing-top-small a-text-normal\"]/span)[1]")).getText() + driver.findElement(By.xpath("(//h2[@ class=\"a-size-base a-spacing-small a-spacing-top-small a-text-normal\"]/span)[3]")).getText();
        System.out.println(searchResult);
        if (searchResult.contains(expectedReslt)){
            System.out.println("İçeriyor");
        }
        else{
            System.out.println("İçermiyor");
        }
        // İlk urunun fiyatını console yazdirin
        System.out.println(driver.findElement(By.xpath("(//span[@class=\"a-price-whole\"])[1]")).getText());
        // 2 sn bekletin ve browseri kapatın
        Thread.sleep(2000);
        driver.quit();
    }
}
