package com.qa.mobile.testcases;

import com.guru99.qa.AppiumWrapper;
import com.guru99.qa.pages.mobilepage.ApiDemos;
import org.testng.annotations.Test;

public class TC001 extends AppiumWrapper {

    ApiDemos demos = new ApiDemos();



    @Test
    public void TC001Test(){

        demos.tapOnViewbtn();
        demos.tapOnDateWidget();
        demos.tapOnInline();
        demos.tapOnDial3();
        demos.dialFifteenToFortyfive();


    }
}
