package lesson_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsAlert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\project\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement alertButton = driver.findElement(By.xpath("//button[.=\"Click for JS Alert\"]"));
        WebElement confirmButton = driver.findElement(By.xpath("//button[.=\"Click for JS Confirm\"]"));
        WebElement promptButton = driver.findElement(By.xpath("//button[.=\"Click for JS Prompt\"]"));
        WebElement result = driver.findElement(By.id("result"));
        alertButton.click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        String expectedResult = "You successfully clicked an alert";
        String actualResult = result.getText();
        // JS ALert de tamam butonuna tiklamak icin accept() methodunu kullanırız
        if (actualResult.equals(expectedResult)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }
        confirmButton.click();
        driver.switchTo().alert().dismiss();
        String expectedResult2 = "You clicked: Cancel";
        String actualResult2 = result.getText();
        if (actualResult2.equals(expectedResult2)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }
        promptButton.click();
        driver.switchTo().alert().sendKeys("Ogi");
        driver.switchTo().alert().accept();
        String expectedResult3 = "You entered: Ogi";
        String actualResult3 = result.getText();

        if (expectedResult3.equals(actualResult3)){
            System.out.println("Test 3 Passed");
        }else {
            System.out.println("Test 3 Failed");
        }
        driver.quit();

    }
}
