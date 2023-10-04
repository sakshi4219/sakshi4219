import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PartialLinkLocaor {
    public static void main(String[] args) {

        System.setProperty("webdriver.firefox.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");


        driver.findElement(By.id("input-firstname")).sendKeys("sakshi");
        driver.findElement(By.id("input-lastname")).sendKeys("tripathi");
        driver.findElement(By.id("input-email")).sendKeys("r101@test.com");
        driver.findElement(By.id("input-telephone")).sendKeys("89773672");
        driver.findElement(By.id("input-password")).sendKeys("hdhkmkddk");
        driver.findElement(By.id("input-confirm")).sendKeys("hdhkmkddk");

        driver.findElement(By.partialLinkText("login page")).click();
        if(driver.findElement(By.partialLinkText("login")).isDisplayed())
        {
            System.out.println("link is displayed");
        }
        else
        {
            System.out.println("link is not displayed");
        }driver.navigate().back();
    }
}
