package com.common.setup.browser;

import org.openqa.selenium.WebDriver;

/**
 * User: mbauer
 * Date: 8/27/14
 * Time: 2:16 PM
 */
public abstract class BrowserStrategy {

    public abstract WebDriver getNewDriver();
}
