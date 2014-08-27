package com.common.setup.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * User: mbauer
 * Date: 8/27/14
 * Time: 2:25 PM
 */
public class HtmlUnitBrowser extends BrowserStrategy {

    @Override
    public WebDriver getNewDriver() {
        return new HtmlUnitDriver();
    }
}
