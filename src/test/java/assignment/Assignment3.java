package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment3
{
        public static void main(String[] args) {
            System.setProperty("webdriver.firefox.driver","drivers/geckodriver.exe");
            WebDriver driver=new FirefoxDriver();
            driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
            String id_FirstName="input-firstname";
            String id_lastname="input-lastname";
            String id_email="input-email";
            String id_telephone="input-telephone";
            String id_password="input-password";
            String id_confirmPwd="input-confirm";
            String path_newsletter= "(//input[@name='newsletter'])[1]";

            String name_agree="agree";
            String xpath_continue="//input[@value='Continue']";
            String xpath_text="//div[@id='content']//p";

            driver.findElement(By.id(id_FirstName)).sendKeys("sakshi");
            driver.findElement(By.id(id_lastname)).sendKeys("tripathi");
            driver.findElement(By.id(id_email)).sendKeys("r1101@test.com");
            driver.findElement(By.id(id_telephone)).sendKeys("89773672");
            driver.findElement(By.id(id_password)).sendKeys("hdhkmkddk");
            driver.findElement(By.id(id_confirmPwd)).sendKeys("hdhkmkddk");

            driver.findElement(By.xpath(path_newsletter)).click();
            driver.findElement(By.name(name_agree)).click();
            driver.findElement(By.xpath(xpath_continue)).click();
            String actual= driver.findElement(By.xpath(xpath_text)).getText();
            if(actual.equals("Congratulations! Your new account has been successfully created!"))
            {
                System.out.println("expected text matching");
            }
            else
                System.out.println("not getting expected result");



        }
    }
