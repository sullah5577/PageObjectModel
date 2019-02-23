package com.guru99.qa;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumWrapper {
    private static AppiumDriver appiumDriver;


    public static AppiumDriver buildAppiumDriver() {
        AppiumDriver appiumDriver = null;
        String appiumServerURL = "http://0.0.0.0:4723/wd/hub";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_API_25");
        capabilities.setCapability(MobileCapabilityType.APP, "/home/faz/Desktop/archive/ApiDemos.apk");
        capabilities.setCapability("avd", "Pixel_API_25");

        try {
            appiumDriver = new AndroidDriver(new URL(appiumServerURL), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return appiumDriver;
    }

    /**
     * This will start an Appium driver and return an Appium driver (or initialize it if it's not initialized)
     * Only 1 driver and server will be started/initialized per run
     *
     * @return Appium driver
     */
    public static AppiumDriver getAppiumDriver() {
        if (appiumDriver == null) {
            try {

                intializeAppiumDriver();
            } catch (MalformedURLException e) {
                Assert.fail("Unable to initialize Appium driver due to invalid Server URL or there server is already in use");

            }
        }

        return appiumDriver;
    }

    /**
     * This method initializes the appium driver object on default mobile device specified in the config file
     *
     * @throws MalformedURLException
     */


    @BeforeTest
    private static void intializeAppiumDriver() throws MalformedURLException {
        appiumDriver = buildAppiumDriver();

        // This is used in cases where fluent wait is not applied (fluentWait() at BaseWebPage class)
        appiumDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    /**
     * This method is used to quit the Appium driver if it is not null
     */
    @AfterTest
    public static void quitAppiumDriver() {
        if (appiumDriver != null) {
            System.out.println("Quitting Appium..");
            appiumDriver.quit();
            System.out.println("Quitting Appium - Done");
            appiumDriver = null;
        }
    }


}
