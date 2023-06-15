package login;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InventoryPage;

public class LoginTests extends BaseTest {

    @Test
    public void testSuccessfulLogin() {

        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");

        InventoryPage inventoryPage = loginPage.clickLoginButton();
        Assert.assertTrue(inventoryPage.getInventory().isEnabled());
    }
}
