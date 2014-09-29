package com.trax.jms.utils;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.io.IOException;
import java.util.Properties;

public class PropertiesFileUtilsTest  {

    private String correctFileName = "mq.properties";
    private String inCorrectFileName = "amq.properties";
    private PropertiesFileUtils utilObj = null;
    private Properties prop = null;

    @Before
    public void initActions(){
        utilObj = new PropertiesFileUtils();
        prop = new Properties();
    }

    @Test
    public void notNullFileStream() throws IOException{
        prop = utilObj.propertyCreator(correctFileName);
        Assert.assertNotNull(utilObj.getIos());

    }

    @Test(expected=NullPointerException.class)
    public void nullFileStream() throws IOException{
        prop = utilObj.propertyCreator(inCorrectFileName);
        Assert.assertNull(utilObj.getIos());
    }

    @Test
    public void notNullProps () throws  IOException{
        prop = utilObj.propertyCreator(correctFileName);
        Assert.assertNotEquals(prop.size(),0);
    }

    @Test (expected = NullPointerException.class)
    public void nullProps () throws  IOException{
        prop = utilObj.propertyCreator(inCorrectFileName);
        Assert.assertNull(prop);
        Assert.assertEquals(prop.size(),0);
    }




}