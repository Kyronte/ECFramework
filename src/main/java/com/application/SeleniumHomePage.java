package com.application;

import com.common.setup.Driver;
import org.testng.Assert;

/**
 * User: mbauer
 * Date: 8/25/14
 * Time: 5:14 PM
 */
public class SeleniumHomePage {

    private static final String expectedTitle = "Selenium - Web Browser Automation";

    private static String getPageTitle() {
        return Driver.getInstance().getTitle();
    }

    public static void isExpectedTitle() {
        Assert.assertEquals(getPageTitle(), expectedTitle);
    }
}
