import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathLocatorTextMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.findElement(By.xpath("//span[text()='Shopping Cart']")).click();
        if(driver.findElement(By.xpath("//h1[text()='Shopping Cart']")).isDisplayed())
        {
            System.out.println("yes");
        }
        else
            System.out.println("no");
    }
}
