package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

public class LoadProperty extends Basepage {

    private static By.ByClassName driver;

    public static void ClickOnElement(By by) {
        driver.findElement((SearchContext) by).click();
    }

    public static void enterText(By by, String text, By.ByClassName driver) {
        driver.findElement((SearchContext) by).sendKeys(text);

    }


    public String getProperty(String browserName) {

        return browserName;
    }
}

