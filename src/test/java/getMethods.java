import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethods 
{
    public static void main(String[] args) {
        System.setProperty("webdriver.google.chrome","drivers/geckodriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        String url=driver.getCurrentUrl();
        String page= driver.getPageSource();
        String title= driver.getTitle();

        System.out.println(url+ " "+page+" "+title);
        driver.quit();
    }
}
