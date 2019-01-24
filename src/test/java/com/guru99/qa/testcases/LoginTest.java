package com.guru99.qa.testcases;

import com.guru99.qa.DriverWrapper;
import com.guru99.qa.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends DriverWrapper {

    LoginPage loginPage = new LoginPage();

    @Test
    public void clickOnSignBtn(){
        loginPage.clickOnSignIn();

        loginPage.loginToApp("ullah.ss@gmail.com","JvP3a4xFkm7BABt");

    }
}
