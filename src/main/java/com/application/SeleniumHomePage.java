package com.application;

import com.common.setup.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * User: mbauer
 * Date: 8/25/14
 * Time: 5:14 PM
 */
public class SeleniumHomePage {

    private static final String expectedTitle = "Selenium - Web Browser Automation";

    public static void isExpectedTitle() {
        Assert.assertEquals(getPageTitle(), expectedTitle);
    }

    public static void navigateToDownloadsPage() {
        Driver.getInstance().findElement(By.id("menu_download")).findElement(By.tagName("a")).click();
        Assert.assertEquals(Driver.getInstance().getCurrentUrl(), "http://www.seleniumhq.org/download/");
    }

    private static String getPageTitle() {
        return Driver.getInstance().getTitle();
    }
}
