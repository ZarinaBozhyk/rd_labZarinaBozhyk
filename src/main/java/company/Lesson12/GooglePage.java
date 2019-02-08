package company.Lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage {
    public WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public String checkURL(){
        String url = driver.getCurrentUrl();
        return url;
    }

}
