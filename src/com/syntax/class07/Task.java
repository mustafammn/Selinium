package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo.php");
        driver.manage().window().maximize();

        String InstagramPageHandle= driver.getWindowHandle();

        driver.switchTo().window(InstagramPageHandle);

        
        WebElement InstagramPageBtn= driver.findElement(By.xpath("//a[@title='Follow @syntaxtech on Instagram']"));

        InstagramPageBtn.click();



        driver.switchTo().window(InstagramPageHandle);





    }
}
