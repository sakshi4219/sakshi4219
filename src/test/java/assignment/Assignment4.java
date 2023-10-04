package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.findElement(By.id("input-email")).sendKeys("patebij@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("test@123");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        if(driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).isEnabled())
        {
            System.out.println("yes");
        }
        else System.out.println("no");

    }
}
