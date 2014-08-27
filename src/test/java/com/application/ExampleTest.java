package com.application;

import com.application.common.BaseTest;
import org.testng.annotations.Test;

/**
 * User: mbauer
 * Date: 8/25/14
 * Time: 5:05 PM
 */
public class ExampleTest extends BaseTest {


    @Test
    public void exampleTest() {
        SeleniumHomePage.isExpectedTitle();
    }

    @Test
    public void exampleTest2() {
        SeleniumHomePage.navigateToDownloadsPage();
    }


}
