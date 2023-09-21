import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class getWindow

{
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://google.com");
        String w=driver.getWindowHandle();
        System.out.println(w);
    }
}
