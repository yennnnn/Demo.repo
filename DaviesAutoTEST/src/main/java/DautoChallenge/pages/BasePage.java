package DautoChallenge.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }



    public SignUpSignInPage goToSignUpSignInPage() {

        WebElement signInPagebotton = driver.findElement(By.className("header_user_info")).findElement(By.className("login"));
        signInPagebotton.click();
        return new SignUpSignInPage(driver);
    }
}
