package com.syntax.pages;

import com.syntax.utils.CommonMethods1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage1 extends CommonMethods1 {
    public WebElement userName= driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
    public WebElement password=driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
    public WebElement LgnBtn=driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));

}
