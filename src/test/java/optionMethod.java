import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class optionMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
        WebElement we=driver.findElement(By.name("FromLB"));
        Select select=new Select(we);
        select.selectByIndex(3);
        select.selectByIndex(2);
        select.selectByIndex(1);
        List<WebElement> option =select.getOptions();
        System.out.println("all options:");
        for (WebElement e: option)
        {
            System.out.println(e.getText());
        }
        WebElement o=select.getFirstSelectedOption();
        System.out.println("first selected option:");
        System.out.println(o.getText());

        List<WebElement> op=select.getAllSelectedOptions();
        System.out.println("all selected option:");
        for (WebElement e: op)
        {
            System.out.println(e.getText());
        }
    }
}
