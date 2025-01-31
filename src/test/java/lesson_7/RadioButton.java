package lesson_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\project\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //https://www.facebook.com adresine gidin
        driver.get("https://www.facebook.com/?locale=tr_TR");
        //“Yeni Hesap Oluşturun” button’una basin
        driver.findElement(By.xpath("//a[.='Yeni hesap oluştur']")).click();
        //“radio buttons” elementlerini locate edin
        WebElement menRadioElement = driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]"));

        //Secili degilse cinsiyet butonundan size uygun olani secin
        if (!menRadioElement.isSelected()){
            menRadioElement.click();
        }

        Thread.sleep(3000);
        driver.quit();

    }
}
