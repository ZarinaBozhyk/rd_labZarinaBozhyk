package Lesson12;

import company.Lesson12.GooglePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleTest {
    private WebDriver driver;
    private GooglePage googlePage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zarina_Bozhyk\\IdeaProjects\\rd_lab\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

    @Test
    public void ckeckCurrentUrl(){
        GooglePage googlePage = new GooglePage(driver);
        String currentUrl = googlePage.getURL();
        Assert.assertEquals("https://www.google.com/", currentUrl);

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
