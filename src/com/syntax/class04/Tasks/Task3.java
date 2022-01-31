package com.syntax.class04.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://syntaxprojects.com/input-form-demo.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[data-bv-field='first_name']")).sendKeys("Mustafa");
        driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Nooristani");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("mm.nooristani1@gmail.com");
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("202-951-4666");
        driver.findElement(By.cssSelector("input[name='address']")).sendKeys("Paddington");
        driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Centreville");
        driver.findElement(By.cssSelector("select[name='state']")).sendKeys("Virginia");
        driver.findElement(By.cssSelector("input[name='zip']")).sendKeys("20121");
        driver.findElement(By.cssSelector("input[name='website']")).sendKeys("www.syntax.com");
        driver.findElement(By.cssSelector("textarea[name='comment']")).sendKeys("Homework was awesome");
        Thread.sleep(2000);

        driver.quit();

    }
}
