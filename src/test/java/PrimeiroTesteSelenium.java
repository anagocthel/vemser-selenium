import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiroTesteSelenium {
    public static void main(String [] args){

        //Direcionando o caminho de onde está o chromedriver
        System.setProperty("webdriver.chrome.driver", "C:/Users/ana.gocthel/chromeDriven/chromedriver.exe");

        //Instganciando o driver
        WebDriver driver = new ChromeDriver();

        //Acessando um site no google
        driver.get("https://formy-project.herokuapp.com/keypress");

        //crio um objeto elemento web e atribuo a ele um elemento de imput através do seu id "name"
        WebElement name = driver.findElement(By.id("name"));
        //clico no elemento
        name.click();
        //envio o meu nome para o campo
        name.sendKeys("Ana Vitória");

        WebElement button = driver.findElement(By.id("button"));
        button.click();



        //Saindo do navegador
        driver.quit();

    }
}
