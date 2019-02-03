package com.guru99.qa;

;
import com.guru99.utilities.ConfigReader;
import com.guru99.utilities.Log;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.util.concurrent.TimeUnit;

public class DriverWrapper {

    private static WebDriver driver = null;




    public static WebDriver getDriver(){
        return driver;

    }



    @BeforeClass
    public void InitiliazeWebDriver(){
        //Write a Log when tests is starting
        Log.startLog("Test is starting!");
        ConfigReader reader = new ConfigReader();

        if (reader.getBrowser().equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }else if (reader.getBrowser().equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        }else if (reader.getBrowser().equalsIgnoreCase("opera")){
            WebDriverManager.operadriver().setup();
            driver = new OperaDriver();

        }else if (reader.getBrowser().equalsIgnoreCase("edge")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get(reader.getUrl());



    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
