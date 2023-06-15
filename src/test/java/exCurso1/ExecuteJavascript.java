package exCurso1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteJavascript {

    public static void main(String[] args)  {
        System.setProperty("wobdriver.chrome.driver", "C:/Users/ana.gocthel/chromeDriven/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();

        WebElement close = driver.findElement(By.id("close-button"));

        //Fecha a modal atraves de um javascript
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", close);

        driver.quit();
    }
}
