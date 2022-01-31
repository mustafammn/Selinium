package com.syntax.class05.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/*HW1: Amazon link count:
Open chrome browser
Go to “https://www.amazon.com/”
Get all links
Get number of links that has text
Print to console only the links that has text
 */
public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement link:links) {
            String linkText=link.getText();

            if(!linkText.isEmpty()){
                System.out.println(linkText);
                String linkAddress=link.getAttribute("href");
                System.out.println(linkAddress);
            }
        }

        System.out.println("The size of the links is: "+links.size());
    }
}
