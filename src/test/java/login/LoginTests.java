package login;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.InventoryPage;
import pages.LoginPage;

public class LoginTests extends BaseTest {
    private WebDriver driver;
    protected LoginPage loginPage;

    @Test
    public void testSuccessfulLogin() {
        System.setProperty("wobdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        loginPage = new LoginPage(driver);

        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");

        InventoryPage inventoryPage = loginPage.clickLoginButton();
        Assert.assertTrue(inventoryPage.getInventory().isEnabled());
    }
}
