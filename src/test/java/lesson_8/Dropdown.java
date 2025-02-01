package lesson_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\project\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        // Dropdown Locate işlemi yapılır.
        WebElement dropdownElement = driver.findElement(By.id("searchDropdownBox"));
        // Select class'ından bir parametreli(dropdownElementi olacak) obje oluşturulur
        Select select = new Select(dropdownElement);

        // 1. Yöntem:
        select.selectByIndex(3);
        System.out.println("3.İndexteki Eleman: " + select.getFirstSelectedOption().getText()); // Baby

        // 2.Yöntem:
        select.selectByValue("search-alias=stripbooks-intl-ship"); // Books

        // 3.Yöntem:
        select.selectByVisibleText("Digital Music");

        List<WebElement> optionList = select.getOptions();
        int sayac=0;

        for (WebElement w: optionList){
            System.out.println(sayac+": "+ w.getText());
            sayac++;
        }


    }
}
