package assignment;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxScript {
    public static void main(String[] args) {
        System.setProperty("Webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://gmail.com");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        if (title.equals("Gmail")) {
            System.out.println("yess");
        } else {
            System.out.println("no");

        }
        driver.quit();
    }

}