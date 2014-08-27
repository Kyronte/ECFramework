package com.common.setup.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * User: mbauer
 * Date: 8/27/14
 * Time: 2:20 PM
 */
public class InternetExplorerBrowser extends BrowserStrategy {

    @Override
    public WebDriver getNewDriver() {
        return new InternetExplorerDriver();
    }

}
