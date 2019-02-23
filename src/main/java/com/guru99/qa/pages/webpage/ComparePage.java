package com.guru99.qa.pages.webpage;

import com.guru99.qa.base.Base;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ComparePage extends Base {



    private By mobileLink = By.xpath("//a[contains(text(),'Mobile')]");
    private By xperiaCompare = By.xpath("(//a[contains(text(),'Add to Compare')])[1]");
    private By iPhoneCompare = By.xpath("(//a[contains(text(),'Add to Compare')])[2]");
    private By compareBtn = By.xpath("//button[@title='Compare']");
    private By compareProductText = By.xpath("//h1[contains(text(),'Compare Products')]");

    public void clickOnMobileLink(){
        clickOn(mobileLink);
    }

    public void clickOnXperiaCompareBtn(){
        clickOn(xperiaCompare);
    }

    public void clickOnIphoneCompareBtn(){
        clickOn(iPhoneCompare);
    }

    public void clickOnCompareBtn(){
        clickOn(compareBtn);
    }

    public void switchToCompareWindow(){
        switchToChildWindow();
    }

    public void verifyCompare(){
        String header = getTextFromElement(compareProductText);
        Assert.assertEquals(header,"COMPARE PRODUCTS");
    }

    public void closePopUpWindow(){
        closeWindow();
    }

    public void switchToOriginalWindow(){
        switchToParentWindow();
    }



}
