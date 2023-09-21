import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class javascriptExecutorMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        WebElement element=driver.findElement(By.id("login-button"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",element);

       // js.executeScript("alert('welcome sakshi');");
        String title=js.executeScript("return document.title;").toString();
        String url=js.executeScript("return document.URL;").toString();
        js.executeScript("window.scrollBy(0,700)");
        System.out.println(
                title
        );
        System.out.println(url);


    }
}
