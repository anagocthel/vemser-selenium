package exCurso1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args)  {
        System.setProperty("wobdriver.chrome.driver", "C:/Users/ana.gocthel/chromeDriven/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();

        //Vai para o alerta aberto
        Alert alert = driver.switchTo().alert();

        //Clica no ok do alerta
        alert.accept();

        driver.quit();
    }
}
