package com.guru99.qa.testcases;

import com.guru99.qa.DriverWrapper;
import com.guru99.qa.pages.HomePage;
import org.testng.annotations.Test;

public class TC001 extends DriverWrapper {


    HomePage page = new HomePage();

    @Test
    public void TestTC001(){
        page.verifyHomePageTitle();
        page.clickOnMobileLink();
        page.selectSortByMenu();
    }
}
