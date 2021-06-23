package org.example;

import org.openqa.selenium.By;

public class HomePage extends LoadProperty {

    public static void openSelectedBrowser(){
        ClickOnElement(By.cssSelector("openbrowser"));
    }


    public void openbrowser() {
    }
}