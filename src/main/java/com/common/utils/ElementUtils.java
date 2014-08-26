package com.common.utils;

import com.common.setup.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by Matias on 18/07/2014.
 */
public class ElementUtils {

    private final static int MAX_WAIT = 20;
    protected static WebDriverWait wait = new WebDriverWait(Driver.getInstance(), MAX_WAIT);

    public static boolean isElementPresent(By by) {
        try {
            Driver.getInstance().findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public static void waitForElementById(final String id) {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id(id)));
    }

    public static void waitForElementByClassName(final String className) {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className(className)));
    }

    public static void waitForElementToBeVisible(final By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void waitForElementToBeVisible(final WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitUntilElementIsHidden(By by) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public static void handleButtonClick(String id) {
        List<WebElement> buttons = Driver.getInstance().findElements(By.id(id));
        for(WebElement button : buttons) {
            if(button.getAttribute("type").equals("submit")) {
                button.click();
            }
        }
    }


}
