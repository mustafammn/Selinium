package com.syntax.pages;

import com.syntax.testBase.BaseClass;

public class loginPageTestWithPageFactory {
    public static void main(String[] args) {
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        loginPageWithPageFactory loginWPG=new loginPageWithPageFactory();
        loginWPG.username.sendKeys("Admin");
        loginWPG.password.sendKeys("HRM@nhrm123");
        loginWPG.loginBtn.click();

        BaseClass.tearDown();

    }
}



