package com.guru99.qa.testcases;

import com.guru99.qa.DriverWrapper;
import com.guru99.qa.pages.MobilePage;
import org.testng.annotations.Test;

public class TC002 extends DriverWrapper {

    MobilePage mobilePage = new MobilePage();


    @Test
    public void TestTC002(){
        mobilePage.clickOnMobileLink();
        mobilePage.verifyXperiaPrice();
    }
}
