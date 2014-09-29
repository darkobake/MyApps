package com.trax.jms.utils;


import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by SG0220142 on 6/15/2014.
 */
public class PropertiesFileUtils {

    //Static class for properties file actions
     private static Properties props;

    @Getter@Setter
     private static InputStream ios;

    private static  InputStream getPropsFileInputStream (String fileName){
        return PropertiesFileUtils.class.getClassLoader().getResourceAsStream(fileName);
    }

    public static Properties propertyCreator(String fileName) throws IOException{
        props = new Properties();
        ios = getPropsFileInputStream(fileName);
        props.load(getPropsFileInputStream(fileName));

        return props;
    }





}
