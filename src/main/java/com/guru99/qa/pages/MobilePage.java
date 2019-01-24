package com.guru99.qa.pages;

import com.guru99.qa.base.Base;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MobilePage extends Base {

    private By mobileLink = By.xpath("//a[contains(text(),'Mobile')]");
    private By xperiaProductPage = By.xpath("//span[@id='product-price-1']//span[@class='price']");
    private By xperiaProductDetailPage = By.xpath("//a[contains(text(),'Sony Xperia')]");


    public void clickOnMobileLink(){
        clickOn(mobileLink);
    }


    public void verifyXperiaPrice(){
        String priceFromProcuctPage = getTextFromElement(xperiaProductPage);
        clickOn(xperiaProductDetailPage);
        String priceFromProductDetailPage = getTextFromElement(xperiaProductPage);

        try {
            Assert.assertEquals(priceFromProcuctPage,priceFromProductDetailPage);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
