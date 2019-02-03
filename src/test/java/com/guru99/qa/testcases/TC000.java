package com.guru99.qa.testcases;

import com.guru99.qa.DriverWrapper;
import com.guru99.qa.pages.LoginPage;
import com.guru99.qa.util.Listeners.TestListener;
import com.guru99.utilities.Log;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestListener.class})
@Feature("Login Tests")
public class TC000 extends DriverWrapper {



    LoginPage loginPage = new LoginPage();

    @Test(priority = 0, description=" Login Scenario with valid username and password.")

    public void clickOnSignBtn(){
        
        loginPage.clickOnSignIn();

        loginPage.loginToApp("ullah.ss@gmail.com","abc123");

    }
}
