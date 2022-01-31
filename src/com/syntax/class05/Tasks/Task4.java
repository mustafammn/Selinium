package com.syntax.class05.Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
HW4
Go to ebay.com
get all the categories and print them in the console
select Computers/Tables & Networking
click on search
verify the title of page.
 */
public class Task4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("");
        driver.manage().window().maximize();

    }
}
