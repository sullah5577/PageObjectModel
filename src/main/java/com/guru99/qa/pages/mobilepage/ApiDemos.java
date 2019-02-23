package com.guru99.qa.pages.mobilepage;

import com.guru99.qa.AppiumWrapper;
import com.guru99.qa.base.MobileBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class ApiDemos extends MobileBase {

/*    TouchAction touchAction = new TouchAction(appiumDriver);
    WebElement viewsLink = appiumDriver.findElementByXPath("//android.widget.TextView[@text='Views']");
    //Tap on views
        touchAction.tap(tapOptions().withElement(element(viewsLink))).perform();

    //Tap on Date Widget
    WebElement dateWidget = appiumDriver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']");
        touchAction.tap(tapOptions().withElement(element(dateWidget))).perform();

    //Tap on inline
    WebElement inlineLink = appiumDriver.findElementByXPath("//android.widget.TextView[@text='2. Inline']");
        touchAction.tap(tapOptions().withElement(element(inlineLink))).perform();

    //Tap on 3 in the clock
        appiumDriver.findElementByXPath("//*[@content-desc='3']").click();

    //hold on 15 and swipe left to 45
    WebElement first = appiumDriver.findElementByXPath("//*[@content-desc='15']");
    WebElement second = appiumDriver.findElementByXPath("//*[@content-desc='45']");
        touchAction.longPress(longPressOptions().withElement(element(first))).moveTo(element(second)).release().perform();*/




    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Views']")
    private MobileElement viewsBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Date Widgets']")
    private MobileElement dateWidgetBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='2. Inline']")
    private MobileElement inlineBtn;

    @AndroidFindBy(xpath = "//*[@content-desc='3']")
    private MobileElement dialThree;

    @AndroidFindBy(xpath = "//*[@content-desc='15']")
    private MobileElement dialFifteen;

    @AndroidFindBy(xpath = "//*[@content-desc='45']")
    private MobileElement dialFortyfive;






    public void tapOnViewbtn(){
        touch(viewsBtn);
    }

    public void tapOnDateWidget(){
        touch(dateWidgetBtn);
    }

    public void tapOnInline(){
        touch(inlineBtn);
    }

    public void tapOnDial3(){
        touch(dialThree);
    }

    public void dialFifteenToFortyfive(){
        TouchAction touchAction = new TouchAction(AppiumWrapper.getAppiumDriver());
        touchAction.longPress(longPressOptions().withElement(element(dialFifteen))).moveTo(element(dialFortyfive)).release().perform();
    }
}
