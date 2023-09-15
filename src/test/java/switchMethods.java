import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class switchMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//        String s=driver.switchTo().alert().getText();
//        System.out.println(s);
//        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        driver.switchTo().alert().dismiss();
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        driver.switchTo().alert().sendKeys("hello ");
        String a=driver.switchTo().alert().getText();
        System.out.println(a);

    }
}
