import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class cookieMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        Set<Cookie> c=driver.manage().getCookies();
        System.out.println(c);
        Cookie cu=driver.manage().getCookieNamed("domain");
        System.out.println(cu);
        Cookie cr=new Cookie("user","tester");
                driver.manage().addCookie(cr);
        System.out.println(driver.manage().getCookieNamed("user"));
    }
}
