import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class mouseActionMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        driver.findElement(By.xpath("//input[@name='agree']//following-sibling::input")).click();
        WebElement element= driver.findElement(By.id("input-firstname"));
        Actions action=new Actions(driver);
        action.moveToElement(element).click(element).sendKeys("john").doubleClick(element).contextClick(element).build().perform();


    }
}
