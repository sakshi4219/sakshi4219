import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class windowHandles {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://naukri.com");
        String mainWindow=driver.getWindowHandle();
        Set<String> handles=driver.getWindowHandles();
        for (String handle: handles)
        {
            if(!mainWindow.equals(handle))
                driver.switchTo().window(handle);
            System.out.println(driver.switchTo().window(handle).getTitle());
            driver.close();

        }
        driver.switchTo().window(mainWindow);
        driver.findElement(By.id("qsb-keyword-sugg")).sendKeys("Automation");
        driver.findElement(By.xpath("//button[text()='Search']")).click();
    }

}
