import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardActionMethod
{
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        Actions actions=new Actions(driver);

        WebElement element=driver.findElement(By.id("input-lastname"));
        actions.keyDown(Keys.SHIFT).sendKeys(element,"smith").build().perform();

    }
}
