package com.syntax.class04.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[@class='form-hint'])[1]/preceding-sibling::input")).sendKeys("Admin");
        driver.findElement(By.xpath("(//span[@class='form-hint'])[2]/preceding-sibling::input")).sendKeys("asdfg");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='divLoginButton']/input")).click();
        WebElement text = driver.findElement(By.xpath("//input[@type='submit']/following-sibling::span"));
        System.out.println(text.getText());
        Thread.sleep(2000);
        driver.quit();
    }
}
