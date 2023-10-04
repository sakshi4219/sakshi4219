import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
        WebElement we=driver.findElement(By.name("FromLB"));
        Select select=new Select(we);
        select.selectByValue("USA");
        select.selectByIndex(3);
        select.selectByVisibleText("Russia");
        select.deselectByIndex(3);
        select.deselectByValue("USA");
        select.deselectAll();


    }
}
