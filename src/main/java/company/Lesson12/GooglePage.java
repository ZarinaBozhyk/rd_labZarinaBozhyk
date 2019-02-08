package company.Lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage {
    public WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    // TODO: name convention. This methods returns URL, so better to call it getURL(). You are not making any checks/verifications here.
    public String checkURL() {
        String url = driver.getCurrentUrl();
        return url;
    }

}
