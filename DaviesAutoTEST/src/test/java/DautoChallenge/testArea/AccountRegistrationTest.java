package DautoChallenge.testArea;

import DautoChallenge.hooks.HooksTest;
import DautoChallenge.pages.BasePage;
import org.junit.Test;

public class AccountRegistrationTest extends HooksTest {


    @Test
    public void doRegistration(){

        String email = "osharejeff@yahoo.com";
        String firstName = "Mandi";
        String lastName = "Mandler";
        String address = "37 Mike street";
        String passWord = "bronze33";
        String zipCode = "11234";
        String futureReferenceAddress = "30 Muna street,New York,132322";
        String mobileNumber = "07423456443";
        String city = "New York";




        BasePage basePage = new BasePage(driver);
        basePage.goToSignUpSignInPage()
                .goToCreateAccountPage(email)
                .register(firstName,lastName,address,zipCode,email,futureReferenceAddress,mobileNumber,city,passWord);

    }




}
