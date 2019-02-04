package com.guru99.qa.testcases;

import com.guru99.qa.DriverWrapper;
import com.guru99.qa.pages.LoginPage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TC000 extends DriverWrapper {



    LoginPage loginPage = new LoginPage();

    @Test

    public void TestTC000(){
        
        loginPage.clickOnSignIn();

        loginPage.loginToApp("ullah.ss@gmail.com","abc123");

    }
}
