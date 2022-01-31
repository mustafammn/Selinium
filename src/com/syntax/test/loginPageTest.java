package com.syntax.test;

import com.syntax.pages.LoginPage;
import com.syntax.testBase.BaseClass;

public class loginPageTest {

    public static void main(String[] args) {
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/validateCredentials");
        LoginPage loginPage=new LoginPage();
        loginPage.userNameField.sendKeys("Admin");
        loginPage.passwordField.sendKeys("Hum@nhrm123");
        loginPage.loginBtn.click();
    }
}
