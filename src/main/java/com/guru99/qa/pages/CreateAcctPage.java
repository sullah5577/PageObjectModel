package com.guru99.qa.pages;

import com.guru99.qa.base.Base;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CreateAcctPage extends Base {
    //private By mobileLink = By.xpath("//a[contains(text(),'Mobile')]");
    private By acctLink = By.xpath("(//span[contains(text(),'Account')])[1]");
    private By myAcctLink = By.xpath("(//a[contains(text(),'My Account')])[1]");
    private By createAcctLink = By.xpath("//span[contains(text(),'Create an Account')]");
    private By firstNameField = By.id("firstname");
    private By lastNameField = By.id("lastname");
    private By emailAddressField = By.id("email_address");
    private By passwordField = By.id("password");
    private By passwordConfirmationField = By.id("confirmation");
    private By registerBtn = By.xpath("//span[contains(text(),'Register')]");
    private By registerSuccessMsg = By.xpath("//span[contains(text(),'Thank you for registering with Main Website Store.')]");
    private By tvLink = By.xpath("//a[text()='TV']");
    private By addWish = By.xpath("(//a[text()='Add to Wishlist'])[1]");
    private By shareWish = By.xpath("//span[text()='Share Wishlist']");
    private By emailShare = By.xpath("//textarea[@id='email_address']");
    private By shareWishlistLink = By.xpath("//span[text()='Share Wishlist']");
    private By shareWishlistSuccessMsg = By.xpath("//span[text()='Your Wishlist has been shared.']");


    public void clickOnAccountLink(){
        clickOn(acctLink);

    }

    public void clickOnMyAccountLink(){

        clickOn(myAcctLink);

    }

    public void clickOnCreateAcctLink(){

        clickOn(createAcctLink);
    }

    public void enterFirstName(String fname){
        setValueToInputField(fname,firstNameField);
    }

    public void enterLastName(String lname){
        setValueToInputField(lname,lastNameField);
    }

    public void enterEmail(String email){
        setValueToInputField(email,emailAddressField);

    }

    public void enterPassword(String pwd){
        setValueToInputField(pwd,passwordField);

    }

    public void enterConfirmationPassword(String pwd){
        setValueToInputField(pwd,passwordConfirmationField);
    }

    public void clickOnRegisterBtn(){
        clickOn(registerBtn);
    }

    public void verifyRegistration(){
        String actualRegistrationMsg = getTextFromElement(registerSuccessMsg);
        String expectedRegistrationMsg = "Thank you for registering with Main Website Store.";
        try {
            Assert.assertEquals(actualRegistrationMsg,expectedRegistrationMsg);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void clickOnTvLink(){
        clickOn(tvLink);
    }

    public void clickOnAddToWish(){
        clickOn(addWish);
    }

    public void clickOnShareWishList(){
        clickOn(shareWish);
    }

    public void emailShareWishList(String enterEmail){
        setValueToInputField(enterEmail,emailShare);
    }

    public void clickOnShareWishlist(){
        clickOn(shareWishlistLink);
    }
    public void verifyShareWishlist(){
        String actualMsg = getTextFromElement(shareWishlistSuccessMsg);
        String expectedMsg = "Your Wishlist has been shared.";
        try {
            Assert.assertEquals(actualMsg,expectedMsg);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
