package com.syntax.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass1 {
    public static WebDriver driver;
    public static void openBrowser(String url){
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public static void closeBrowser(){
        if(driver!=null){
            driver.quit();
        }
    }
}
