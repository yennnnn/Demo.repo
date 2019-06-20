package DautoChallenge.hooks;

import DautoChallenge.browserManager.BrowserFactory;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class HooksTest {

    protected WebDriver driver;
    private BrowserFactory browserFactory;

    @Before
    public void preConditionTest(){
        this.browserFactory = new BrowserFactory();
        this.driver = browserFactory.setUp();

    }




    @After
    public void postConditionTest(){
        browserFactory.cleanUP();

    }




}
