package com.syntax.classReview1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        System.out.println("browser launched");

        driver.get("https://www.google.com/");

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getTitle());

    }
}
