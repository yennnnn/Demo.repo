package DautoChallenge.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage extends BasePage {
    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    private WebElement mrTitleElement = driver.findElement(By.id("id_gender1"));
    private WebElement fNameElement = driver.findElement(By.id("customer_firstname"));
    WebElement lNameElement = driver.findElement(By.id("customer_lastname"));
    WebElement emailElement = driver.findElement(By.id("email"));
    WebElement passWordElement = driver.findElement(By.id("passwd"));
    WebElement yourAddressFnameElement = driver.findElement(By.id("firstname"));
    WebElement yourAddressLnameElement = driver.findElement(By.id("lastname"));
    WebElement addressElement = driver.findElement(By.id("address1"));
    WebElement zCodeElement = driver.findElement(By.id("postcode"));
    WebElement stateElement = driver.findElement(By.id("id_state"));
    WebElement countryElement = driver.findElement(By.id("id_country"));
    WebElement fReferenceAddressElement = driver.findElement(By.id("alias"));
    WebElement mobileNoElement = driver.findElement(By.id("phone_mobile"));
    WebElement cityElement = driver.findElement(By.id("city"));
    WebElement registerButtonElement = driver.findElement(By.id("submitAccount"));


    public MyAccountPage register(String firstName, String lastName, String address, String zipCode, String email, String futureReferenceAddress, String mobileNumber, String city, String passWord) {




        mrTitleElement.click();


        if (fNameElement.isEnabled()){
            fNameElement.sendKeys(firstName);
        }else { System.out.println("Error message: First name text box not enabled"); }


        if (lNameElement.isEnabled()){
            lNameElement.sendKeys(lastName);
        }else { System.out.println("Error message: Last name text box not enabled"); }



        if (emailElement.isEnabled()){
            emailElement.clear();
            emailElement.sendKeys(email);
        }else { System.out.println("Error message: Email text box not enabled"); }


        if (passWordElement.isEnabled()){
            passWordElement.clear();
            passWordElement.sendKeys(passWord);
        }else { System.out.println("Error message: Password textbox not enabled"); }


        Select daysSelect  = new Select(driver.findElement(By.id("days")));
        daysSelect.selectByValue("18");
        Select monthsSelect  = new Select(driver.findElement(By.id("months")));
        monthsSelect.selectByValue("7");
        Select yearsSelect  = new Select(driver.findElement(By.id("years")));
        yearsSelect.selectByValue("1985");


        if (yourAddressFnameElement.isEnabled()){
            yourAddressFnameElement.clear();
            yourAddressFnameElement.sendKeys(firstName);
        }else { System.out.println("Error message: Your address first name  text box not enabled"); }


        if (yourAddressLnameElement.isEnabled()){
            yourAddressLnameElement.clear();
            yourAddressLnameElement.sendKeys(lastName);
        }else { System.out.println("Error message: Your address last name text box not enabled"); }


        if (addressElement.isEnabled()){
            addressElement.sendKeys(address);
        }else { System.out.println("Error message: Address text box not enabled"); }



        if (cityElement.isEnabled()){
            cityElement.sendKeys(city);
        }else { System.out.println("Error message: City text box not enabled"); }


        if (stateElement.isEnabled()){
            Select stateSelect = new Select(stateElement);
            stateSelect.selectByValue("32");
        }else { System.out.println("Error message: State drop down not enabled"); }


        if (zCodeElement.isEnabled()){
            zCodeElement.sendKeys(zipCode);
        }else { System.out.println("Error message: Zipcode text box not enabled"); }


        if (countryElement.isEnabled()){
            Select countrySelect = new Select(countryElement);
            countrySelect.selectByValue("21");
        }else { System.out.println("Error message: Country drop down not enabled"); }


        if (mobileNoElement.isEnabled()){ mobileNoElement.sendKeys(mobileNumber);
        }else { System.out.println("Error message: Mobile number text box not enabled"); }


        if (fReferenceAddressElement.isEnabled()){
            fReferenceAddressElement.clear();
            fReferenceAddressElement.sendKeys(futureReferenceAddress);
        }else {System.out.println("Error message: Address alias text box not enabled"); }


        registerButtonElement.click();










return new MyAccountPage(driver);
    }

}
