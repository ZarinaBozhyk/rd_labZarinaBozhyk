package company.Lesson10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookMainPage {
    private WebDriver driver;
    public FacebookMainPage(WebDriver driver) {
        this.driver = driver;
    }
    private By email = By.xpath("//input[@id='email']");
    private By password = By.xpath("//input[@id='pass']");
    private By button = By.xpath("//input[@value='Увійти']");

    public FacebookMainPage userEmailType (String mail){
        driver.findElement(email).sendKeys(mail);
        return this;
    }
    public FacebookMainPage userPassType (String pass){
        driver.findElement(password).sendKeys(pass);
        return this;
    }
    public FacebookLoginPage clickButton(){
        driver.findElement(button).click();
        return new FacebookLoginPage(driver);
    }
    }
