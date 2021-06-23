package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends LoadProperty {

    @BeforeMethod
    public void OpenBrowser(ChromeDriver driver) {
    BrowserSelector .openSelectedBrowser();

    }
    @AfterMethod
    public void CloseBrowser(WebDriver driver){
        driver.quit();
    }

    {
    }


}
