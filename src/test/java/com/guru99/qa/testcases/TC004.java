package com.guru99.qa.testcases;

import com.guru99.qa.DriverWrapper;
import com.guru99.qa.pages.ComparePage;
import org.testng.annotations.Test;

public class TC004 extends DriverWrapper {

    /**
     * 1.Click on "MOBILE" menu
     * 2.In the list of all mobile, click on 'Add to Compare' for Sony Xperia mobile
     * 3.In the list of all mobile, click on 'Add to Compare' for iPhone mobile
     * 4.Click on the 'COMPARE' button
     * 5.Verify the pop-up window and check that products are reflected in it
     * 6.Close the Pop-up window
     */

    ComparePage page = new ComparePage();

    @Test
    public void TestTC004() throws InterruptedException {
        page.clickOnMobileLink();
        Thread.sleep(3000);
        page.clickOnXperiaCompareBtn();
        Thread.sleep(3000);
        page.clickOnIphoneCompareBtn();
        page.clickOnCompareBtn();
        page.switchToCompareWindow();
        page.verifyCompare();
        page.closePopUpWindow();
        Thread.sleep(3000);
        
    }
}
