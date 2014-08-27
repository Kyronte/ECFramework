package com.common.setup;

import com.common.utils.PropertyFileReader;

/**
 * User: mbauer
 * Date: 8/25/14
 * Time: 5:22 PM
 */
public class TestHandler {

    private static final String baseUrl = PropertyFileReader.getValueForProperty("environment");

    public static void handleTestStart() {
        Driver.getInstance().manage().window().maximize();
        Driver.getInstance().get(baseUrl);
    }

    public static void handleTestFinish() {
        Driver.getInstance().quit();
    }
}
