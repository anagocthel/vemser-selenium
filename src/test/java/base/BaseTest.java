package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class BaseTest {
    private WebDriver driver;
    protected LoginPage loginPage;

    public void setUp(){
        System.setProperty("wobdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        loginPage = new LoginPage(driver);

        driver.quit();
    }
    public static void main(String args[]){
        BaseTest test = new BaseTest();
        test.setUp();
    }


}
