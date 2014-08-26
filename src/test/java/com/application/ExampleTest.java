package com.application;

import com.common.setup.Driver;
import com.common.setup.TestHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * User: mbauer
 * Date: 8/25/14
 * Time: 5:05 PM
 */
public class ExampleTest {

    @BeforeTest
    public void setUp() {
        TestHandler.handleTestStart();
    }

    @Test
    public void exampleTest() {
        SeleniumHomePage.isExpectedTitle();
    }

    @AfterTest
    public void tearDown() {
        TestHandler.handleTestFinish();
    }
}
