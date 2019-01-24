package com.guru99.qa.testcases;

import com.guru99.qa.DriverWrapper;
import com.guru99.qa.pages.PaymentPage;
import org.testng.annotations.Test;

public class TC006 extends DriverWrapper {

    /**
     * 1. Go to http://live.guru99.com/
     * 2. Click on my account link
     * 3. Login in application using previously created credential
     * 4. Click on MY WISHLIST link
     * 5. In next page, Click ADD TO CART link
     * 6. Enter general shipping country, state/province and zip for the shipping cost estimate
     * 7. Click Estimate
     * 8. Verify Shipping cost generated
     * 9. Select Shipping Cost, Update Total
     * 10. Verify shipping cost is added to total
     * 11. Click "Proceed to Checkout"
     * 12a. Enter Billing Information, and click Continue
     * 12b. Enter Shipping Information, and click Continue
     * 13. In Shipping Method, Click Continue
     * 14. In Payment Information select 'Check/Money Order' radio button. Click Continue
     * 15. Click 'PLACE ORDER' button
     * 16. Verify Oder is generated. Note the order number
     */
    PaymentPage page = new PaymentPage();

    @Test
    public void TestTC006(){
        page.clickOnMyAcct();

        page.loginToApp();

        page.clickMyWishlist();

        page.clickOnAddToCart();

        page.enterShippingCountry("United Arab Emirates");
        //page.enterShippingState("43");
        page.enterShippingZipcode("00000");

        page.clickEstimate();

        page.verifyShippingCostGenerated();

        page.selectShippingCost();
        page.verifyShippingCost();

        page.clickProceedToCheckout();

        page.enterBillingInformation("Shofi","Ullah","ABC","Queens","56478","718-555-0123");

        page.clickOnContinueShipping();

        page.selectPaymentMethod();

        page.placeOrder();

        page.verifyOrderNumber();



    }

}
