package DautoChallenge.testArea;

import DautoChallenge.hooks.HooksTest;
import DautoChallenge.pages.BasePage;
import org.junit.Assert;
import org.junit.Test;

public class AddItemToCartTest extends HooksTest {


    @Test
    public void AddItemToCart(){

        String userName = "osharejeff@yahoo.com";
        String passWord = "bronze33";
        String titleOfAddedItem = "Faded Short Sleeve T-shirts";

        BasePage basePage = new BasePage(driver);

       boolean validatedCartItemResult = basePage
                .goToSignUpSignInPage()
                .logIntoAccount(userName,passWord)
                .goToTshirtPage()
                .selectItem().addItemToCart()
                .validatedItemAddedToCart(titleOfAddedItem);
        Assert.assertTrue(validatedCartItemResult);


    }





}
