package com.common.setup;

import com.common.utils.PropertyFileReader;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * User: mbauer
 * Date: 8/25/14
 * Time: 5:22 PM
 */
public class TestHandler {

    private static final String baseUrl = PropertyFileReader.getValueForProperty("environment");

    public static void handleTestStart() {
        Driver.driver = new FirefoxDriver();
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get(baseUrl);
    }

    public static void handleTestFinish() {
        Driver.getDriver().quit();
    }
}
