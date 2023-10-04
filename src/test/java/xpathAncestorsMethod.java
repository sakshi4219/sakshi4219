import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathAncestorsMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        driver.findElement(By.xpath("//input[@value='Continue']//ancestor::div[1]/a")).click();
    }
    }

