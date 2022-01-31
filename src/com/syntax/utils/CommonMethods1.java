package com.syntax.utils;

import com.syntax.testBase.BaseClass1;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class CommonMethods1 extends BaseClass1 {
    public static void sendKeys(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    public static void takeTheScreenShot(String filename ){
        //        take screen shot
        TakesScreenshot ts=(TakesScreenshot) driver;
//        take screen shot
        File screenShot = ts.getScreenshotAs(OutputType.FILE);
//        we need to save the screenshot file in our computer


        try {
            FileUtils.copyFile(screenShot,new File("screenshot/ss/"+filename+".png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }




}
