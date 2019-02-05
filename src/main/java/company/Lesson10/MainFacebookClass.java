package company.Lesson10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainFacebookClass {
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zarina_Bozhyk\\IdeaProjects\\rd_lab\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        GooglePage googlePage = new GooglePage(driver);
        googlePage.inputText("Facebook");
        googlePage.submit();
        googlePage.clickFacebookLink();
        FacebookMainPage facebookMainPage = new FacebookMainPage(driver);
        facebookMainPage.userEmailType("badlogin");
        facebookMainPage.userPassType("badpassword");
        facebookMainPage.clickButton();
        FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
        facebookLoginPage.printText();
        facebookLoginPage.compareText();
        facebookLoginPage.close();

    }
}
