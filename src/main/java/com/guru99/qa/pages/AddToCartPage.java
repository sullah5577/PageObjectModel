package com.guru99.qa.pages;

import com.guru99.qa.base.Base;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AddToCartPage extends Base {

    //Locators
    private By mobileLink = By.xpath("//a[contains(text(),'Mobile')]");
    private By addToCartXperia = By.xpath("//button[@title='Add to Cart']//span/span");
    private By qtyInputField = By.xpath("//input[@title='Qty']");
    private By qtyUpdateBtn = By.xpath("//button[@title='Update']");
    private By qtyErrorMsg = By.xpath("//p[@class='item-msg error']");
    private By emptyCartBtn = By.xpath("//button[@title='Empty Cart']//span//span");
    private By emptyCartMsg = By.xpath("//h1[contains(text(),'Shopping Cart is Empty')]");

    //Methods

    //Step 1: Click on Mobile menu
    public void clickOnMobileMenu() {
        clickOn(mobileLink);
    }

    //Step 2: In the list of all mobile, click on 'ADD TO CART' for Sony Xperia mobile
    public void clickOnAddToCart() {
        clickOn(addToCartXperia);
    }

    //Step 3: Change 'QTY' value to 1000 and click 'UPDATE' button.
    public void changeQtyValue() {
        clearValueToInputField(qtyInputField);
        setValueToInputField("1000", qtyInputField);
        clickOn(qtyUpdateBtn);
    }

    //Step 4: Verify error message
    public void verifyErrorMsg() {
        String actualErrMsg = getTextFromElement(qtyErrorMsg);
        String expectedErrMsg = "* The maximum quantity allowed for purchase is 500.";
        try {
            Assert.assertEquals(actualErrMsg, expectedErrMsg);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //Step 5: click on 'EMPTY CART' link in the footer of list of all mobiles.
    public void clickOnEmptyCart(){
        clickOn(emptyCartBtn);
    }

    //Step 6: Verify cart is empty
    public void verifyCartEmpty(){
        String actualCartMsg = getTextFromElement(emptyCartMsg);
        String expectedCartMsg = "SHOPPING CART IS EMPTY";
        try {
            Assert.assertEquals(actualCartMsg,expectedCartMsg);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
