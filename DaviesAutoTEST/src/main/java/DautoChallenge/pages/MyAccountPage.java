package DautoChallenge.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage extends BasePage {
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }


    public boolean validateLogIn(String validationMessage){

        return driver.findElement(By.className("info-account")).getText().contains(validationMessage);

    }


    public TshirtCatalogPage goToTshirtPage() {



       driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();

        return new TshirtCatalogPage(driver);


    }
}
