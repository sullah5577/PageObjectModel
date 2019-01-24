package com.guru99.qa.testcases;

import com.guru99.qa.DriverWrapper;
import com.guru99.qa.pages.CreateAcctPage;
import org.testng.annotations.Test;

public class TC005 extends DriverWrapper {

    /**
     * 1.Click on my account link
     * 2.Click Create Account link and fill new user information
     * 3.Click Register
     * 4.Verify Registration is done
     * 5.Go to TV menu
     * 6.Add product in your wish list
     * 7.Click SHARE WISHLIST
     * 8.In the next page enter Email and a message and click SHARE WISHLIST
     * 9. Check wishlist is shared
     */

    CreateAcctPage page = new CreateAcctPage();

    @Test
    public void TestTC005(){
        page.clickOnAccountLink();
        page.clickOnMyAccountLink();
        page.clickOnCreateAcctLink();

        page.enterFirstName("James");
        page.enterLastName("Brown");
        page.enterEmail("jamesbrown@grr.la");
        page.enterPassword("abc1234");
        page.enterConfirmationPassword("abc1234");
        page.clickOnRegisterBtn();
        page.verifyRegistration();

        page.clickOnTvLink();
        page.clickOnAddToWish();
        page.clickOnShareWishList();
        page.emailShareWishList("jamesbrown@grr.la");
        page.clickOnShareWishlist();
        page.verifyShareWishlist();

    }
}
