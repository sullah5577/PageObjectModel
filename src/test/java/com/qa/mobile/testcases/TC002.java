package com.qa.mobile.testcases;

import com.guru99.qa.AppiumWrapper;
import com.guru99.qa.pages.mobilepage.ApiDemos2;
import org.testng.annotations.Test;

public class TC002 extends AppiumWrapper {

    ApiDemos2 demos2 = new ApiDemos2();


    @Test
    public void TC002Test (){
        demos2.tapOnPreference();
        demos2.tapOnPreferenceDep();
        demos2.tapOnPreferenceCheckbox();
        demos2.tapOnWifiSettings();
        demos2.setValueToWifiSettings();
        demos2.acceptWifiSettingInput();
    }

    @Test
    public void TC002Test02(){
        demos2.tapOnViewbtn();
        demos2.tapOnDragAndDropBtn();
        demos2.dragAndDrop();
    }
}
