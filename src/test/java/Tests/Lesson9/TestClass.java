package Tests.Lesson9;

import company.Lesson8.DataConvertation;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.nio.file.Path;


public class TestClass {
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
//        ChromeDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com");
//        // driver.findElement(By.xpath("//input[@title = 'Поиск']]")).sendKeys("Under pressure");
//        WebElement findEl = driver.findElement(By.name("q"));
//
//        findEl.sendKeys("Under preasure");
//        findEl.sendKeys(Keys.RETURN);
//        System.out.println("hello");
//
//    }

    @Test
    public void firstTest() {
        //String s= FirstTest.class.getResource("chromedriver.exe").getPath();
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
//        if (driverName.equals("chrome")) {
//            driver = new ChromeDriver();
//        } else{
//            driver = new FirefoxDriver();
//        }
        //((FirefoxDriver) driver).installExtension(new File("sdvsdv").toPath());
        driver.get("https://www.google.com");
        // driver.findElement(By.xpath("//input[@title = 'Поиск']]")).sendKeys("Under pressure");
        // By findEl = driver.findElementsByXPath("//input[@id="q"]");
        WebElement findEl = driver.findElement(By.xpath("//input[@name=\"q\"]"));
        findEl.sendKeys("Under pressure");
        findEl.submit();
        String ytlink = "https://www.youtube.com/watch?v=a01QQZyl-_I";
        driver.get(ytlink);
        WebElement fullSc = driver.findElement(By.xpath("//div/button[@title=\"Full screen (f)\"]"));
        fullSc.click();
        //WebElement findF2 = driver.findElement(By.xpath("//div[@cite class="iUh30"]"));


        // WebElement findEl2 = driver.findElement(By.className("LC20lb"));
        // findEl2.submit();


    }

}


