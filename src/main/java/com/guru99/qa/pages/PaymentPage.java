package com.guru99.qa.pages;

import com.guru99.qa.DriverWrapper;
import com.guru99.qa.base.Base;
import com.guru99.qa.utilities.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

public class PaymentPage extends Base {

    private By myAcctLink = By.xpath("(//a[text()='My Account'])[2]");
    private By userName = By.xpath("//input[@id='email']");
    private By password = By.xpath("//input[@id='pass']");
    private By loginBtn = By.xpath("//span[text()='Login']");
    private By myWishlistLink = By.xpath("//div[@class='block-content']/ul/child::li[8]/a");
    private By addToCartLink = By.xpath("(//span[text()='Add to Cart'])[1]");
    private By shippingCountry = By.xpath("//select[@id='country']");
    private By shippingState = By.xpath("//select[@id='region_id']");
    private By shippingZipcode = By.xpath("//input[@id='postcode']");
    private By shippingEstimate= By.xpath("//span[text()='Estimate']");
    private By shippingCostGenerated = By.xpath("//dt[text()='Flat Rate']");
    private By shippingFlatRate = By.xpath("(//span[@class='price'])[5]");
    private By selectShippingRateOption=By.xpath("//input[contains(@name,'estimate_method')]");
    private By updateTotal = By.xpath("//button[@type='submit']//span[text()='Update Total']");
    private By shippingHandlingRate = By.xpath("(//td[@class='a-right']//span[@class='price'])[3]");
    private By proceedToCheckout = By.xpath("(//span[text()='Proceed to Checkout'])[2]");
    private By billingFirstName = By.xpath("//input[@id='billing:firstname']");
    private By billingLastName = By.xpath("//input[@id='billing:lastname']");
    private By billingAddress = By.xpath("//input[@id='billing:street1']");
    private By billingCity = By.xpath("//input[@id='billing:city']");
    private By billingState = By.xpath("//input[@id='billing:region_id']");
    private By billingZipcode = By.xpath("//input[@id='billing:postcode']");
    private By billingCountry = By.xpath("//input[@id='billing:country_id']");
    private By billingPhone = By.xpath("//input[@id='billing:telephone']");
    private By billingContinue = By.xpath("(//button[@title='Continue'])[1]");
    private By shippingContinueBtn = By.xpath("(//span[text()='Continue'])[3]");
    private By paymentMoneyOrder = By.xpath("//input[@id='p_method_checkmo']");
    private By paymentContinueBtn = By.xpath("(//span[text()='Continue'])[4]");
    private By paymentPlaceOrderBtn = By.xpath("//span[text()='Place Order']");
    private By paymentComplete = By.xpath("//p[text()='Your order # is: ']/a");

    ConfigReader reader = new ConfigReader();



    public void clickOnMyAcct(){
        clickOn(myAcctLink);
    }



    public void loginToApp(){
        setValueToInputField(reader.getUsername(),userName);
        setValueToInputField(reader.getPassword(),password);
        clickOn(loginBtn);
    }

    public void clickMyWishlist(){
        clickOn(myWishlistLink);
    }

    public void clickOnAddToCart(){
        clickOn(addToCartLink);
    }



    public void enterShippingCountry(String value){
        selectFromDropDown(value, shippingCountry);

    }

    public void enterShippingState(String value){
        selectFromDropDown(value,shippingState);
    }
    public void enterShippingZipcode(String value){
        setValueToInputField(value,shippingZipcode);
    }

    public void clickEstimate(){
        clickOn(shippingEstimate);
    }

    public void verifyShippingCostGenerated(){
        String actualMsg= getTextFromElement(shippingCostGenerated);
        String expectedMsg = "Flat Rate";
        try {
            Assert.assertEquals(actualMsg,expectedMsg);
        }catch (Exception e ){
            e.printStackTrace();
        }

        String actualFlatRatePrice= getTextFromElement(shippingFlatRate);
        String expectedFlatRatePrice = "$5.00";
        try {
            Assert.assertEquals(actualFlatRatePrice,expectedFlatRatePrice);
        }catch (Exception e ){
            e.printStackTrace();
        }
    }

    public void selectShippingCost(){
        clickOn(selectShippingRateOption);
        clickOn(updateTotal);
    }

    public void verifyShippingCost(){

        String actualMsg = getTextFromElement(shippingFlatRate);
        String expectedMsg = getTextFromElement(shippingHandlingRate);
        try {
            Assert.assertEquals(actualMsg,expectedMsg);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void clickProceedToCheckout(){
        clickOn(proceedToCheckout);
    }

    public void enterBillingInformation(String fname,String lname,String address,String city,String zipcode,String telephone){
        setValueToInputField(fname,billingFirstName);
        setValueToInputField(lname,billingLastName);
        setValueToInputField(address,billingAddress);
        setValueToInputField(city,billingCity);
        selectFromDropDown("43",billingState);
        setValueToInputField(zipcode,billingZipcode);
        selectFromDropDown("US",billingCountry);
        setValueToInputField(telephone,billingPhone);
        clickOn(billingContinue);


    }

    public void clickOnContinueShipping(){
        clickOn(shippingContinueBtn);
    }

    public void selectPaymentMethod(){
        clickOn(paymentMoneyOrder);
        clickOn(paymentContinueBtn);
    }

    public void placeOrder(){
        clickOn(paymentPlaceOrderBtn);
    }

    public void verifyOrderNumber(){
        boolean orderNo = DriverWrapper.getDriver().findElement(paymentComplete).isDisplayed();
        try {
            Assert.assertTrue(orderNo);
        }catch (NoSuchElementException e){
            e.printStackTrace();
        }
    }

}
