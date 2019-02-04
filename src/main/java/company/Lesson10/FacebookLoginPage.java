package company.Lesson10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookLoginPage {
    private WebDriver driver;
   // private By actual_errorMessage = By.xpath("//div[@class='_4rbf _53ij']");
    private String actual_errorMessage = driver.findElement(By.xpath("//div[@class='_4rbf _53ij']")).getAttribute("innerHTML");
    private String expected_errorMessage = "Вы ввели неправильный пароль. Забули пароль? ";

    public FacebookLoginPage(WebDriver driver) {
        this.driver = driver;
    }

     public void printText(){
         System.out.println(actual_errorMessage);
     }
     public void compareText (){
        if (actual_errorMessage.contains(expected_errorMessage)){
            System.out.println("Test pass");
        }else {
            System.out.println("Test failed");
        }
     }
     public void close(){
        driver.quit();
     }

}
