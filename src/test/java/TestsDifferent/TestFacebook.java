package TestsDifferent;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class TestFacebook {
    @Test
    public void testFaceBook() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        // Looking forward... Usage of waiters - good! :)
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://facebook.com/");
        WebElement login = driver.findElement(By.xpath("//input[@id=\"email\"]"));

        login.sendKeys("11111");

        // a lot of empty lines

        WebElement password = driver.findElement(By.xpath("//input[@id=\"pass\"]"));
        password.sendKeys("1111");

        password.submit();
        WebElement message = driver.findElement(By.xpath("//div[@class=\"_4rbf _53ij\"]"));
        if (message.isDisplayed()) {
            WebElement recoverPass = driver.findElement(By.id("pass"));
            recoverPass.sendKeys("lololo");
            WebElement loginButton = driver.findElement(By.id("loginbutton"));
            loginButton.click();

        }

        //TODO: add error message verification, as mentioned in "Step 10" of your task.
        //TODO: add driver quit()

        // Great!
    }

}


