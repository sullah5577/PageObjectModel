package com.guru99.qa.pages.webpage;

import com.guru99.qa.base.Base;
import org.openqa.selenium.By;

public class HomePage extends Base {

    private By mobileLink = By.xpath("//a[contains(text(),'Mobile')]");
    private By sortByMenu = By.xpath("//select[@title='Sort By']");


    public void verifyHomePageTitle(){
        getTitleOfPage("Home page");
    }

    public void clickOnMobileLink(){
        clickOn(mobileLink);
    }

    public void verifyMobilePageTitle(){
        getTitleOfPage("Mobile");
    }

    public void selectSortByMenu(){
        clickOn(sortByMenu);
        selectFromDropDown("Name",sortByMenu);



    }
}
