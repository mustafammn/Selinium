package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");
        driver.getCurrentUrl();
        //returns the current url loaded in the browser
        String url= driver.getCurrentUrl();
        System.out.println("The current URL loaded in browser is: "+url);

        String title=driver.getTitle();
        System.out.println("The current titile of page is: "+title);

        driver.quit();

    }
}
