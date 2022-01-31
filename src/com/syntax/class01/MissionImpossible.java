package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MissionImpossible {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("http:/www.amazon.com");
        String title= driver.getTitle();
        System.out.println("Title: "+title);
        driver.close();



    }
}
