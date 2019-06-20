package DautoChallenge.browserManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

    private String baseUrl = "http://automationpractice.com/index.php";
    private WebDriver driver;



    public WebDriver setUp() {

        String systemPath = System.getProperty("user.dir") + "\\drivers\\chromeDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", systemPath);
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(baseUrl);
        return driver;


    }
        public void cleanUP(){

           if (driver!= null){
               driver.quit();
           }
    }

    }






