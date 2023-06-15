package exCurso1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("wobdriver.chrome.driver", "C:/Users/ana.gocthel/chromeDriven/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park BLvd, Palo Alto, CA");
            //Pausa pra esperar aparecer a caixa de selecao
            Thread.sleep(1000);
        //Funcionalidade não está funcionando na página não da pra terminar o teste

        autocomplete.click();

    }
}
