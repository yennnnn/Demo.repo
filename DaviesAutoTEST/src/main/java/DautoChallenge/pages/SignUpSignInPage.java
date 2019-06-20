package DautoChallenge.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpSignInPage extends BasePage {
    public SignUpSignInPage(WebDriver driver) {
        super(driver);
    }



    public CreateAccountPage goToCreateAccountPage(String email) {

        driver.findElement(By.name("email_create")).sendKeys(email);
        driver.findElement(By.id("SubmitCreate")).click();
        return new CreateAccountPage(driver);

    }




    public MyAccountPage logIntoAccount(String userName, String passWord) {

        driver.findElement(By.id("email")).sendKeys(userName);
        driver.findElement(By.id("passwd")).sendKeys(passWord);
        driver.findElement(By.id("SubmitLogin")).click();

        return new MyAccountPage(driver);

    }




}
