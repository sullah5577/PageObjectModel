package com.guru99.qa.testcases;

import com.guru99.qa.DriverWrapper;
import com.guru99.qa.pages.AddToCartPage;
import org.testng.annotations.Test;

public class TC003 extends DriverWrapper {

    /**
     * 1.Go to http://live.guru99.com
     * 2.Click on "MOBILE" menu
     * 3.In the list of all mobile, click on 'ADD TO CART' for Sony Xperia mobile
     * 4.Change 'QTY' value to 1000 and click 'UPDATE' button.
     * 5.Verify error message
     * 6.Then click on 'EMPTY CART' link in the footer of list of all mobiles.
     * 7.Verify cart is empty
     *
     * Expected Results:
     * 1.On clicking update button an error is shown 'The requested quantity for "Sony Xperia" is not avbailable.'
     * 2.On clicking empty cart button - a message 'SHOPPING CART IS EMPTY' is shown
     */


    AddToCartPage cartPage = new AddToCartPage();

    @Test
    public void TestTC003(){
        cartPage.clickOnMobileMenu();
        cartPage.clickOnAddToCart();
        cartPage.changeQtyValue();
        cartPage.verifyErrorMsg();
        cartPage.clickOnEmptyCart();
        cartPage.verifyCartEmpty();

    }
}
