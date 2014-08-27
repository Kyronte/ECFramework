package com.application;

import com.common.setup.TestHandler;
import com.common.utils.PropertyFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

/**
 * User: mbauer
 * Date: 8/25/14
 * Time: 5:05 PM
 */
public class ExampleTest {

    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.out.println("Set Up...");
        TestHandler.handleTestStart();
    }

/*    @Test
    public void exampleTest() {
        SeleniumHomePage.isExpectedTitle();
        System.out.println("Asserting page title");
    }*/

    @Test
    public void exampleTest2() {
        SeleniumHomePage.navigateToProjectsPage();
        Reporter.log("This is test 2");
        System.out.println("Navigate to Projects page");
    }

    @Test
    public void exampleTest3() {
        SeleniumHomePage.navigateToDownloadsPage();
        Reporter.log("This is test 3");
        System.out.println("Navigate to Download page");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Tear Down...");
        TestHandler.handleTestFinish();
        //driver.quit();
    }


}
