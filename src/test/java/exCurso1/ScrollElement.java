package exCurso1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("wobdriver.chrome.driver", "C:/Users/ana.gocthel/chromeDriven/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));

        //Actions serve para realizar ações dentro da página como descer a barra de rolagem
        Actions actions = new Actions(driver);
        actions.moveToElement(name);

        name.sendKeys("Ana Vitória");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("30/12/1998");

        driver.quit();

    }
}
