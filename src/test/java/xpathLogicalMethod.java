import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathLogicalMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("test2@test.com");
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test@123");
        driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
        driver.findElement(By.xpath("//a[@class='btn btn-primary' or text()='Continue']")).click();

    }
}
