package com.common.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * User: mbauer
 * Date: 8/11/14
 * Time: 2:44 PM
 */
public class PropertyFileReader {


    private static PropertyFileReader propertyFileReader;

    private PropertyFileReader() {}

    public static PropertyFileReader getInstance() {
        if(propertyFileReader == null) {
            propertyFileReader = new PropertyFileReader();
        }
        return propertyFileReader;
    }

    public static String getValueForProperty(String property) {
        propertyFileReader = PropertyFileReader.getInstance();

        Properties prop = new Properties();
        String propFileName = "config.properties";

        InputStream input = PropertyFileReader.class.getClassLoader().getResourceAsStream(propFileName);
        try {
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return prop.getProperty(property);
    }

}
