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

        By searchBoxPartialLink = By.partialLinkText("Forgotten Pass"); // linkTextten farklı olarak sadece bir kısmını yazmamız yeterlidir.
        WebElement searchBoxPartialLinkElement = driver.findElement(searchBoxPartialLink);
        WebElement searchBoxPartialLinkElement2 = driver.findElement(By.partialLinkText("Forgotten Pass");

        By searchBoxTagName = By.tagName("input"); // Tag'ı input olan değerleri seçer. Birden çok değer döndürür.
        WebElement searchBoxTagNameElement = driver.findElement(searchBoxTagName);
        WebElement searchBoxTagNameElement2 = driver.findElement(By.tagName("input"));

        // Absolute xPath

        // // div / table / tbody

        // /html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div[1]/div[1]/input

        // Sadece tagname kullanarak
        driver.findElement(By.xpath("//input"));

        // Tagname farketmeksizin attribute name ve attribute value kullanarak
        driver.findElement(By.xpath("// * [@type='text']"));

        // Atribute name farketmeksizin tagname ve attribute value kullanarak
        driver.findElement(By.xpath("// input[@ *='text']"));

        // Atribute value farketmeksizin tagname ve attribute name kullanarak
        driver.findElement(By.xpath("// input[@type]"));

        // Bazen de attribute bağlı olmadan sadece text ile bulunabilir

        // Belirli bir text ile element bulma
        driver.findElement(By.xpath("//tagname[.='text name']"));
        driver.findElement(By.xpath("//tagname[.='text name']"));

        // Belli bir metni içeren bir öğeyi bulmak için
        driver.findElement(By.xpath("//*[contains(text(),'Bir Parça Yazı')]"));

        // Tek bir attribute ile unique sonuca ulaşılmazsa birden fazla attribute yazılabilir.

        driver.findElement(By.xpath("//div[@id='logo' or class = 'flex-col logo']"));
        driver.findElement(By.xpath("//div[@id='logo' and class = 'flex-col logo']"));



        // Css selector xpath'e benzer. 3 kullanımı var
        // TagName[attribute name='value']
        driver.findElement(By.cssSelector("input[name='session[password]']"));
        // tagname#idValue veya #idvalue
        driver.findElement(By.cssSelector("input#session_password"));
        // tagname.classValue veya sadece .classValue
        driver.findElement(By.cssSelector(".form-control"));

    }
}
