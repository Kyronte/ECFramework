package com.common.setup.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * User: mbauer
 * Date: 8/27/14
 * Time: 2:18 PM
 */
public class ChromeBrowser extends BrowserStrategy {

    @Override
    public WebDriver getNewDriver() {
        return new ChromeDriver();
    }
}
