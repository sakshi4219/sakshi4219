package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstScript
{
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://youtube.com");
      driver.manage().window().maximize();
      String title=driver.getTitle();
        if(title.equals("YouTube"))
        {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
