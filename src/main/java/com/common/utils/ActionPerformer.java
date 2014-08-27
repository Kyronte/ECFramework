package com.common.utils;

import com.common.setup.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Matias on 17/07/2014.
 */
public class ActionPerformer {

    protected static WebDriver driver;
    protected static Actions builder;
    private static ActionPerformer actionPerformer;

    public static ActionPerformer getInstance() {
        if(actionPerformer == null) {
            actionPerformer = new ActionPerformer();
        }
        return actionPerformer;
    }

    public ActionPerformer() {
        driver = Driver.getDriver();
        builder = new Actions(driver);
    }

    public void hoverOverElement(WebElement element) {
        Actions hoverOverElement = builder.moveToElement(element);
        hoverOverElement.build().perform();
    }

}
