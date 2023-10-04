package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FinalProject {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        //1
        driver.get("https://tutorialsninja.com/demo/");
        //2
        driver.findElement(By.xpath("//a[@title='My Account']")).click();
        driver.findElement(By.xpath("//a[text()='Login']")).click();
//3
        driver.findElement(By.id("input-email")).sendKeys("patebij@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("test@123");
        driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
//4
        driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']")).click();
        driver.findElement(By.xpath("//a[text()='Show AllLaptops & Notebooks']")).click();

        //5
        driver.findElement(By.xpath("(//span[text()='Add to Cart'])[3]")).click();
        driver.findElement(By.xpath("(//span[text()='Add to Cart'])[4]")).click();

        //6
        driver.findElement(By.xpath("//span[text()='Shopping Cart']")).click();

        //7
        String s1=driver.findElement(By.xpath("(//a[contains(@href,'product_id=44')])[4]")).getText();
        String s2=driver.findElement(By.xpath("(//a[contains(@href,'product_id=45')])[4]")).getText();
       if( s1.equals("MacBook Air"))
       {
           System.out.println("getting");
       }
       else {
           System.out.println("not");
       }
        if( s2.equals("MacBook Pro"))
        {
            System.out.println("getting");
        }
        else {
            System.out.println("not");
        }

       String total=driver.findElement(By.xpath("(//table[@class='table table-bordered'])[3]//tr[4]/td[2]")).getText();
        if(total.equals("$3,202.00"))
        {
            System.out.println("same");
        }
        else {
            System.out.println("not same");
        }
        driver.findElement(By.xpath("//a[text()='Checkout']")).click();
driver.quit();
    }
}
