package com.common.utils;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * User: mbauer
 * Date: 7/16/14
 * Time: 4:09 PM
 */
public class RandomEmailGenerator {

    public static String generate() {
        return "autom" + RandomStringUtils.randomAlphanumeric(10) + "@automation.com";
    }
}
