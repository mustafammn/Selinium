package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://chercher.tech/practice/implicit-wait-example");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        WebElement selectCheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        selectCheckBox.click();
        Thread.sleep(2000);
        driver.quit();
    }
}
