package com.common.setup.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * User: mbauer
 * Date: 8/27/14
 * Time: 2:19 PM
 */
public class FirefoxBrowser extends BrowserStrategy {

    @Override
    public WebDriver getNewDriver() {
        return new FirefoxDriver();
    }
}
