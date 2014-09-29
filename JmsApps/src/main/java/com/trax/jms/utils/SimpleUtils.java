package com.trax.jms.utils;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.Session;
import java.io.IOException;

/**
 * Created by SG0220142 on 6/11/2014.
 */
public class SimpleUtils {
    //util function to pass ActiveMq Connection factory
    private static final String PROPERTY_FILENAME = "mq.properties";
    private static final String PROPERTY_URL_KEY = "mq.url";
    private static final String PROPERTY_REMOTE_URL_KEY = "mq.url";


   public static String mqProperties(String propertyKey) throws  IOException{
       return PropertiesFileUtils.propertyCreator(PROPERTY_FILENAME).getProperty(propertyKey);
   }

    private static String returnMqUrl() throws IOException{
        return PropertiesFileUtils.propertyCreator(PROPERTY_FILENAME).getProperty(PROPERTY_URL_KEY);
    }


    //Returns an connection factory object
    public static ActiveMQConnectionFactory getConnectionFactory(){
        ActiveMQConnectionFactory facCon = null;
        try {
            facCon =  new ActiveMQConnectionFactory(mqProperties("mq.user"),mqProperties("mq.password"),mqProperties(PROPERTY_REMOTE_URL_KEY));
        } catch (IOException e) {
            System.out.println("IO Exceptions .. ");
            e.printStackTrace();
        }

        return facCon;
    }

    //returns connection
    public static Connection getMqConnection(ActiveMQConnectionFactory factoryObject) throws JMSException {
        Connection con = factoryObject.createConnection();
        return con;

    }

    //return a session
    public static Session getSession(Connection con) throws JMSException{
        Session session = con.createSession(false,Session.AUTO_ACKNOWLEDGE);
        return null;
    }


}
