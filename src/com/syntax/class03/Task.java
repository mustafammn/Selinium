package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.syntaxprojects.com");
        driver.findElement(By.xpath("//a[contains(@id,'btn_b')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='list-group-item' and text()='Simple Form Demo']")).click();
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("You are so intelligent");
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();





    }
}
