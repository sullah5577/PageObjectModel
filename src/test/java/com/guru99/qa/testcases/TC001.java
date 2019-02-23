package com.guru99.qa.testcases;

import com.guru99.qa.DriverWrapper;

import com.guru99.qa.pages.webpage.HomePage;
import com.guru99.qa.utilities.Log;
import org.testng.annotations.Test;

public class TC001 extends DriverWrapper {


    HomePage page = new HomePage();

    @Test
    public void TestTC001(){


        Log.info("Verify Title of homepage");
        page.verifyHomePageTitle();
        Log.info("Click on the Mobile link");
        page.clickOnMobileLink();
        Log.info("From the sort drop down select Menu");
        page.selectSortByMenu();
    }
}
