package DautoChallenge.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPage extends BasePage {
    public ItemPage(WebDriver driver) { super(driver); }



    public ItemPage addItemToCart() {
        driver.findElement(By.name("Submit")).click();
        return this;

    }





    public boolean validatedItemAddedToCart(String titleOfAddedItem){


        return driver.findElement(By.id("layer_cart_product_title")).getText().toLowerCase().contains(titleOfAddedItem.toLowerCase());



    }



}
