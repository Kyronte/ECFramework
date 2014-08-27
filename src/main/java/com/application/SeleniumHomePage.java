package com.application;

import com.common.setup.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * User: mbauer
 * Date: 8/25/14
 * Time: 5:14 PM
 */
public class SeleniumHomePage {

    private static final String expectedTitle = "Selenium - Web Browser Automation";

    public static void isExpectedTitle() {
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }

    public static void navigateToProjectsPage() {
        Driver.getDriver().findElement(By.id("menu_projects")).findElement(By.tagName("a")).click();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "http://www.seleniumhq.org/projects/");
    }

    public static void navigateToDownloadsPage() {
        Driver.getDriver().findElement(By.id("menu_download")).findElement(By.tagName("a")).click();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "http://www.seleniumhq.org/download/");
    }

    private static String getPageTitle() {
        return Driver.getDriver().getTitle();
    }
}
