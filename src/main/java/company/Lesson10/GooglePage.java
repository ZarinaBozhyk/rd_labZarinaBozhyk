package company.Lesson10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage {
    private WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }
    private By googleSearchField = By.xpath("//input[@class='gLFyf gsfi']");
    private By facebookLink = By.xpath("//h3[text()='Facebook — увійдіть або зареєструйтеся']");
   // private By googleSearchButton = By.xpath("//button[@class='Tg7LZd']");

    public GooglePage inputText(String text) {
        driver.findElement(googleSearchField).sendKeys("Facebook");
        return this;
    }

    public FacebookMainPage clickFacebookLink(){
        driver.findElement(facebookLink).click();
        return new FacebookMainPage(driver);
    }

    public  FacebookLoginPage submit(){
        driver.findElement(googleSearchField).submit();
        return new FacebookLoginPage(driver);
    }
//    public FacebookMainPage clickSubmitButton(){
//        driver.findElement(googleSearchButton).click();
//        return new FacebookMainPage(driver);
//
//    }
}
