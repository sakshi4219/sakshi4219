import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.google.driver","drivers/geckodriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().fullscreen();
        Point po=driver.manage().window().getPosition();
        System.out.println(po.x);
        System.out.println(po.y);
        //Point point =driver.manage().window().setPosition()
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();;
    }
}
