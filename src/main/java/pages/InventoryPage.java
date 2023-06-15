package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
    private WebDriver driver;

    private By inventoryContainer= By.id("inventory_container");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getInventory(){
       WebElement inventory= driver.findElement(inventoryContainer);
       return inventory;
    }

}
