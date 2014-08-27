package com.application.common;

import com.common.setup.TestHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Created by Matias on 26/08/2014.
 */
public class BaseTest {

    @BeforeTest
    public void setUp() {
        TestHandler.handleTestStart();
    }

    @AfterTest
    public void tearDown() {
        TestHandler.handleTestFinish();
    }
}
