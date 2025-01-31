package lesson_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\project\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.manage().window().maximize();

        // Checkbox1 ve Checkbox2 yi locate et
        WebElement checkboxElement1 = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]"));
        WebElement checkboxElement2 = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]"));
        // Checkbox1 seçili değilse seç
        if (checkboxElement1.isSelected() == false){
            checkboxElement1.click();
        }
        // Checkbox2 seçili değilse seç
        if (checkboxElement2.isSelected() == false){
            checkboxElement2.click();
        }
        Thread.sleep(3000);
        driver.quit();
    }
}
