package com.application;

import com.common.setup.TestHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * User: mbauer
 * Date: 8/25/14
 * Time: 5:05 PM
 */
public class ExampleTest {

    @BeforeMethod
    public void setUp() {
        TestHandler.handleTestStart();
    }

    @Test(testName = "Selenium Page Title Test")
    public void exampleTest() {
        SeleniumHomePage.isExpectedTitle();
        System.out.println("Asserting page title");
    }

    @Test(testName = "Navigate to Projects Page Test")
    public void exampleTest2() {
        SeleniumHomePage.navigateToProjectsPage();
        System.out.println("Navigate to Projects page");
    }

    @Test(testName = "Navigate to Downloads Page Test")
    public void exampleTest3() {
        SeleniumHomePage.navigateToDownloadsPage();
        System.out.println("Navigate to Download page");
    }

    @AfterMethod
    public void tearDown() {
        TestHandler.handleTestFinish();
    }


}
