package com.syntax.pages;

import com.syntax.utils.CommonMethods1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageWithPageFactory1 extends CommonMethods1 {
    @FindBy (id="txtUsername")
    public WebElement userName;
    @FindBy (id="txtPassword")
    public WebElement password;
    @FindBy (id="btnLogin")
    public WebElement LgnBtn;

    public loginPageWithPageFactory1 () {
        PageFactory.initElements(driver,this);
    }

}
