package com.guru99.qa.pages.webpage;


import com.guru99.qa.base.Base;
import org.openqa.selenium.By;

public class LoginPage extends Base {


    //Locators

    private By signInLink = By.xpath("(//a[text()='My Account'])[2]");
    private By emailTextField = By.id("email");
    private By passTextField = By.id("pass");
    private By loginBtn = By.xpath("//span[text()='Login']");


    //Methods
    public void clickOnSignIn(){
        clickOn(signInLink);
    }

    public void enterEmail(String email){
        setValueToInputField(email,emailTextField);
    }

    public void enterPassword(String password){
        setValueToInputField(password,passTextField);
    }

    public void clickOnLoginButton(){
        clickOn(loginBtn);
    }

    public void loginToApp(String email, String password){
        enterEmail(email);
        enterPassword(password);
        clickOnLoginButton();
    }

}
