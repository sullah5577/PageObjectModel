package com.guru99.qa.pages.mobilepage;

import com.guru99.qa.AppiumWrapper;
import com.guru99.qa.base.MobileBase;
import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import static io.appium.java_client.MobileBy.AndroidUIAutomator;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class ApiDemos2 extends MobileBase {





    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Preference']")
    private MobileElement prefencesBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='3. Preference dependencies']")
    private MobileElement preferenceDependencies;

    @AndroidFindBy(id = "android:id/checkbox")
    private MobileElement preferenceCheckbox;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='WiFi settings']")
    private MobileElement wifiSettings;

    @AndroidFindBy(className = "android.widget.EditText")
    private MobileElement wifiSettingsInput;

    @AndroidFindBy(uiAutomator = ("text(\"OK\")"))
    private MobileElement wifiSettingsSubmit;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Drag and Drop']")
    private MobileElement dragAndDropBtn;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Views']")
    private MobileElement viewsBtn;

    public void tapOnViewbtn(){
        touch(viewsBtn);
    }




    public void tapOnPreference(){
        touch(prefencesBtn);
    }

    public void tapOnPreferenceDep(){
        touch(preferenceDependencies);
    }

    public void tapOnPreferenceCheckbox(){
        touch(preferenceCheckbox);
    }

    public void tapOnWifiSettings(){
        touch(wifiSettings);
    }

    public void setValueToWifiSettings(){
        setValue(wifiSettingsInput,"123abc");
    }

    public void acceptWifiSettingInput(){
        touch(wifiSettingsSubmit);
    }

    public void tapOnDragAndDropBtn(){
        touch(dragAndDropBtn);
    }

    public void dragAndDrop(){

        WebElement source = (WebElement) AppiumWrapper.getAppiumDriver().findElementsByClassName("android.view.View").get(0);
        WebElement destination = (WebElement) AppiumWrapper.getAppiumDriver().findElementsByClassName("android.view.View").get(1);

        TouchAction touchAction = new TouchAction(AppiumWrapper.getAppiumDriver());
        touchAction.longPress(element(source)).moveTo(element(destination)).release().perform();
    }



}
