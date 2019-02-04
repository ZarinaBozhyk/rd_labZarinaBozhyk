package company.Lesson10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage {
    private WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }
    private By googleSearchField = By.xpath("//input[@id='q']");
    private By googleSearchButton = By.xpath("//button[@class='Tg7LZd']");

    public GooglePage inputText(String text) {
        driver.findElement(googleSearchField).sendKeys("Facebook");
        return this;
    }
    public FacebookMainPage clickSubmitButton(){
        driver.findElement(googleSearchButton).click();
        return new FacebookMainPage(driver);

    }
}
