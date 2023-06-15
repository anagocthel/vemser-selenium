package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;

public class BaseTest {
    private WebDriver driver;
    protected LoginPage loginPage;

   @BeforeClass
    public void setUp() {
        System.setProperty("wobdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        loginPage = new LoginPage(driver);

    }

    @AfterClass
    public void tearDown(){

        driver.quit();
    }
}
