package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/window-popup-modal-demo.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        WebElement followInstagram = driver.findElement(By.xpath("//a[@title='Follow @syntaxtech on Instagram']"));
        followInstagram.click();

        Set<String> allHandles = driver.getWindowHandles();
        Iterator<String> it= allHandles.iterator();

        while (it.hasNext()){
            String handler=it.next();
            driver.switchTo().window(handler);
            String title=driver.getTitle();
            if(title.contains("Instagram")){
                System.out.println("The title of new window is: "+driver.getTitle());
                break;

            }
        }

        driver.quit();
    }
}
