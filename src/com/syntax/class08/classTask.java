package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class classTask {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/dynamic-elements-loading.php");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        WebElement startButton=driver.findElement(By.cssSelector("button#startButton"));

        startButton.click();


        WebElement text=driver.findElement(By.xpath("//h4[@style='padding: 10%;']"));

        System.out.println(text.getText());
    }
}
