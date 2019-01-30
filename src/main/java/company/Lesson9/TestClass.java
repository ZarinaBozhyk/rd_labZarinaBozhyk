package company.Lesson9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        // driver.findElement(By.xpath("//input[@title = 'Поиск']]")).sendKeys("Under pressure");
        WebElement findEl = driver.findElement(By.name("q"));
        findEl.sendKeys("Under preasure");
        findEl.sendKeys(Keys.RETURN);
        System.out.println("hello");

    }

}
