package com.common.setup;

import com.common.setup.browser.*;
import com.common.utils.PropertyFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * User: mbauer
 * Date: 8/25/14
 * Time: 2:18 PM
 */
public class Driver {

    public static WebDriver driver = null;
    private static BrowserStrategy browserStrategy;

    static {
        String driverType = PropertyFileReader.getValueForProperty("driver");
        switch (driverType) {
            case "firefox":
                browserStrategy = new FirefoxBrowser();
                break;
            case "ie":
                browserStrategy = new InternetExplorerBrowser();
                break;
            case "chrome":
                browserStrategy = new ChromeBrowser();
                break;
            case "htmlunit":
                browserStrategy = new HtmlUnitBrowser();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

/*
    public static WebDriver getInstance() {
        if (driver == null) {
            driver = browserStrategy.getNewDriver();
        }
        return driver;
    }*/



}
