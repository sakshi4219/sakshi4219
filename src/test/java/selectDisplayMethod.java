import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class selectDisplayMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.NANOSECONDS);

       if(driver.findElement(By.name("newsletter")).isDisplayed())
       {
           if(!driver.findElement(By.xpath("(//input[@name='newsletter']) [1]")).isSelected())
           {
               driver.findElement(By.xpath("(//input[@name='newsletter']) [1]")).click();

           }
       }
       if(driver.findElement(By.name("agree")).isEnabled())
       {
           driver.findElement(By.name("agree")).click();
       }

    }
}
