import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssLoader {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

        driver.findElement(By.cssSelector("input#input-email")).sendKeys("patebij@gmail.com");
        driver.findElement(By.cssSelector("input#input-password")).sendKeys("test@123");
        driver.findElement(By.cssSelector("input[value='Login']")).click();


    }
}
