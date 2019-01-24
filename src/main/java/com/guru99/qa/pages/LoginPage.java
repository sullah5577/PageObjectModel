package com.guru99.qa.pages;


import com.guru99.qa.base.Base;
import org.openqa.selenium.By;

public class LoginPage extends Base {


    //Locators

    private By signInLink = By.xpath("//a[@class='login']");
    private By emailTextField = By.id("email");
    private By passTextField = By.id("passwd");
    private By loginBtn = By.xpath("//button[@id='SubmitLogin']");


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
