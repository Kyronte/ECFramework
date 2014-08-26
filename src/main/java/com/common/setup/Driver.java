package com.common.setup;

import com.common.utils.PropertyFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * User: mbauer
 * Date: 8/25/14
 * Time: 2:18 PM
 */
public class Driver {

    private static WebDriver driver;

    public static WebDriver getInstance() {
        if (driver == null) {
            handleDriverCreation();
        }
        return driver;
    }

    private static void handleDriverCreation() {
        String browser = PropertyFileReader.getValueForProperty("driver");

        switch (browser) {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "ie":
                driver = new InternetExplorerDriver();
                break;
            case "chrome":
                driver = new ChromeDriver();
                break;
        }
    }


}
