import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selectMethod
{
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).clear();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("user-name")).click();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        WebElement webElement=driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        Select select=new Select(webElement);
//        select.selectByValue("az");
//        select.selectByIndex(3);
//        select.selectByVisibleText("Name (A to Z)");
       boolean multi= select.isMultiple();
    System.out.println(multi);
    }
}
