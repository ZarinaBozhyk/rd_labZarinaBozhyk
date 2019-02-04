package TestsDifferent;

import org.junit.Assert;
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
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://facebook.com/");
        WebElement login = driver.findElement(By.xpath("//input[@id=\"email\"]"));
        login.sendKeys("55555545");
        WebElement password = driver.findElement(By.xpath("//input[@id=\"pass\"]"));
        password.sendKeys("1555111");
        password.submit();
        WebElement message = driver.findElement(By.xpath("//div[@class=\"_4rbf _53ij\"]"));
        String actual_error = message.getText();
        System.out.println(actual_error);
        String expected_error = "The email or phone number you’ve entered doesn’t match any account. Sign up for an account.";
        if(actual_error.contains(expected_error)){
            System.out.println("Test Case Passed");
        }else
            System.out.println("Test Case Passed");
        driver.quit();
    }
}


