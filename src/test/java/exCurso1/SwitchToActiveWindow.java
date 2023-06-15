package exCurso1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args)  {
        System.setProperty("wobdriver.chrome.driver", "C:/Users/ana.gocthel/chromeDriven/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();
        //pega o id da janela aberta no link
        String originalHandle = driver.getWindowHandle();


        //percorre as duas janelas abertas
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        //volta pra janela inicial
        driver.switchTo().window(originalHandle);
        driver.quit();
    }
}

