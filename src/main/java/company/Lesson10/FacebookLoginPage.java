package company.Lesson10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookLoginPage {

    public FacebookLoginPage(WebDriver driver) {
        this.driver = driver;
    }
    private WebDriver driver;
    private By actual_errorMessage = By.xpath("//div[@class='_4rbf _53ij']");
    private String expected_errorMessage = "Вы ввели неправильный пароль. Забули пароль? ";
    public String getActual_errorMessage() {
        return driver.findElement(actual_errorMessage).getAttribute("innerHTML");
    }
    public void printText() {
        System.out.println(getActual_errorMessage());
    }
    public void compareText() {
        if (getActual_errorMessage().contains(expected_errorMessage)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test failed");
        }
    }
    public void close() {
        driver.quit();
    }
}
