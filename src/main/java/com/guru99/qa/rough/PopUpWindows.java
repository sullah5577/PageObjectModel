package com.guru99.qa.rough;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PopUpWindows {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://live.guru99.com/index.php/mobile.html");

        driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #3')]")).click();

        Set<String> handler = driver.getWindowHandles();

        Iterator<String> it = handler.iterator();

        String parent = it.next();
        System.out.println("Parent id is :" + parent);

        String child = it.next();
        System.out.println("Child id is :" + child);

        driver.switchTo().window(child);
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(parent);
        System.out.println(driver.getTitle());


        }

}


