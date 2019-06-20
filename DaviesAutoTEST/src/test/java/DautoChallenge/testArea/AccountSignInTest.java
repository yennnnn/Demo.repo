package DautoChallenge.testArea;

import DautoChallenge.hooks.HooksTest;
import DautoChallenge.pages.BasePage;
import org.junit.Assert;
import org.junit.Test;

public class AccountSignInTest extends HooksTest {


    @Test
    public void doSignIn (){

        String userName = "osharejeff@yahoo.com";
        String passWord = "bronze33";
        String validationMessage = "Welcome to your account";



        BasePage basePage = new BasePage(driver);

        boolean validateResult = basePage
                .goToSignUpSignInPage()
                .logIntoAccount(userName,passWord)
                .validateLogIn(validationMessage);
        Assert.assertTrue(validateResult);


    }



}
