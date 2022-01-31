package com.syntax.class05.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
HW3
Go to facebook
click on create new account  page
Fill out the whole form
Click signup
 */
public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement CreateAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        CreateAccount.click();
        Thread.sleep(2000);

        WebElement firstName = driver.findElement(By.cssSelector("input#u_9_b_iI"));
        firstName.sendKeys("Ahmad");

        WebElement lastName = driver.findElement(By.cssSelector("input#u_9_d_j4"));
        lastName.sendKeys("Aseel");

        WebElement phoneNumber = driver.findElement(By.cssSelector("input#u_9_g_4x"));
        phoneNumber.sendKeys("2024555555");

        WebElement password = driver.findElement(By.cssSelector("input#password_step_input"));
        password.sendKeys("Ahmad2021!");

        WebElement month = driver.findElement(By.cssSelector("select#month"));
        month.sendKeys("August");

        WebElement day = driver.findElement(By.cssSelector("select#day"));
        day.sendKeys("29");

        WebElement year = driver.findElement(By.cssSelector("select#year"));
        year.sendKeys("1990");

        WebElement male = driver.findElement(By.xpath("//label[@class='_58mt'][@for='u_9_5_Do']"));
        male.click();

        WebElement signUp = driver.findElement(By.cssSelector("button#u_1m_s_ln"));
        signUp.click();

        driver.findElement(By.cssSelector("")).sendKeys();


    }

}
