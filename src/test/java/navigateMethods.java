import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethods
{
    public static void main(String[] args) {
        System.setProperty("webdriver.google.driver","drivers/geckodriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://google.com");
        driver.navigate().to("https://gmail.com");
        driver.navigate().to("https://naukri.com");
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();
    }
}
