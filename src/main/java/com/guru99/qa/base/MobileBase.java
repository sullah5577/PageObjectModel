package com.guru99.qa.base;

import com.guru99.qa.AppiumWrapper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;


public class MobileBase {

    public MobileBase() {
        initPageElements();
    }




    protected void initPageElements() {


        PageFactory.initElements(new AppiumFieldDecorator(AppiumWrapper.getAppiumDriver()), this);


    }

    /**
     * This method is used to tap on element
     * @param mobileElement
     */
    protected void tapOn(MobileElement mobileElement) {
        try {
            mobileElement.click();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }

    /**
     * This method is used to set value in text field
     *
     * @param mobileElement
     * @param setValue
     */
    protected void setValue(MobileElement mobileElement, String setValue) {

        try {
            mobileElement.sendKeys(setValue);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }

    protected void verifyElement(MobileElement mobileElement){
        try {

            Assert.assertTrue(mobileElement.isDisplayed());

        }catch (NoSuchElementException e){
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate Element using:  " + mobileElement.toString());

        }
    }

    protected void touch(MobileElement mobileElement){
        TouchAction action = new TouchAction(AppiumWrapper.getAppiumDriver());
        action.tap(tapOptions().withElement(element(mobileElement))).perform();



    }

}
