package DautoChallenge.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TshirtCatalogPage extends BasePage {

    public TshirtCatalogPage(WebDriver driver) {
        super(driver);
    }


    public ItemPage selectItem() {


        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")).click();

        return new ItemPage(driver);

    }


}
