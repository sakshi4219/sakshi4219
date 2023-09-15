import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPathSelectorcontainMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://tutorialsninja.com/demo/");

        driver.findElement(By.xpath("(//a[contains[@href,'contact']])[1]")).click();
       if( driver.findElement(By.xpath("//textarea[@id='input-enquiry']")).isDisplayed())
        System.out.println("constact us page is pahe is displayed");
       else System.out.println("not displayed");

    }
}
