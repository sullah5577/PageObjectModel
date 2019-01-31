package com.guru99.qa.base;

import com.guru99.qa.DriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;



public class Base {

    public void clickOn(By locator){
        DriverWrapper.getDriver().findElement(locator).click();

    }


    public void clearValueToInputField( By locator){
        try {
            DriverWrapper.getDriver().findElement(locator).clear();
        }catch (NoSuchElementException e){
            e.printStackTrace();
            System.out.println("Screenshot taken");
            Assert.fail("Element is not found with this locator" + locator.toString());
        }
    }

    public void setValueToInputField(String value, By locator){
        try {
            DriverWrapper.getDriver().findElement(locator).sendKeys(value);
        }catch (NoSuchElementException e){
            e.printStackTrace();
            System.out.println("Screenshot taken");
            Assert.fail("Element is not found with this locator" + locator.toString());
        }
    }

    public String getTextFromElement(By locator){
        return  DriverWrapper.getDriver().findElement(locator).getText();
    }

    public String getTitleOfPage(String expectedTitle){
        String actualTitle = DriverWrapper.getDriver().getTitle();

       Assert.assertEquals(actualTitle,expectedTitle);
        return DriverWrapper.getDriver().getTitle();
    }





    public void selectFromDropDown(String value,By locator){

        Select dropdown = new Select(DriverWrapper.getDriver().findElement(locator));

        dropdown.selectByVisibleText(value);

    }

    public void switchToChildWindow(){

        try {
            Set<String> handle = DriverWrapper.getDriver().getWindowHandles();
            Iterator<String> it = handle.iterator();
            String parent = it.next();
            String child = it.next();
            DriverWrapper.getDriver().switchTo().window(child);

        }catch (NoSuchElementException e){
            e.printStackTrace();
        }

    }

    public void switchToParentWindow(){
        try {
            Set<String> handle = DriverWrapper.getDriver().getWindowHandles();
            Iterator<String> it = handle.iterator();
            String parent = it.next();
            String child = it.next();
            DriverWrapper.getDriver().switchTo().window(parent);
            System.out.println(DriverWrapper.getDriver().getTitle());
        }catch (NoSuchElementException e){
            e.printStackTrace();
        }
    }

    public void closeWindow(){
        DriverWrapper.getDriver().close();

    }

    public void waitUntilVisibilityOfElement( By locator){
        WebDriverWait wait=null;
        new WebDriverWait(DriverWrapper.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}
