package com.guru99.qa.testcases;

import com.guru99.qa.DriverWrapper;
import com.guru99.qa.pages.LoginPage;

import com.guru99.qa.utilities.Log;
import org.apache.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TC000 extends DriverWrapper {



    LoginPage loginPage = new LoginPage();




    @Test

    public void TestTC000(){

        Log.info("Click on the sign in button");
        loginPage.clickOnSignIn();


        Log.info("Enter Login credentials");
        loginPage.loginToApp("ullah.ss@gmail.com","abc123");

    }
}
