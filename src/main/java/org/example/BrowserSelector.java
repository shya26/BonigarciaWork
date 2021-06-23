package org.example;

import java.lang.invoke.SwitchPoint;

public class BrowserSelector extends Basepage {
    static LoadProperty loadProperty = new LoadProperty();

    public static void openSelectedBrowser() {
        String browserName = loadProperty.getProperty("browserName");
        switch (browserName) {
            case "Chrome":
                System.out.println("open Chrome");
                break;

            case "edge":
                System.out.println("open edge");
                break;

            case "Opera":
                System.out.println("open Opera");
                break;

            default:
                System.out.println("open browser");


        }
    }
}
