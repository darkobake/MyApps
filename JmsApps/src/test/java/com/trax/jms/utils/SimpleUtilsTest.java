package com.trax.jms.utils;


import org.apache.activemq.ActiveMQConnectionFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.Session;

public class SimpleUtilsTest {

        private ActiveMQConnectionFactory conFac = null;
        private Connection con = null;
        private Session session = null;

        @Before
        public void initSuit(){

        }

        @Test
        public void notNullConnectionFactory(){
            conFac  = SimpleUtils.getConnectionFactory();
            Assert.assertNotNull(conFac);
        }

        @Test
        public void notNullConnection() throws JMSException{
            conFac  = SimpleUtils.getConnectionFactory();
            con = SimpleUtils.getMqConnection(conFac);
            Assert.assertNotNull(con);
        }

         @Test
         public void notNullSession()throws JMSException{
             conFac  = SimpleUtils.getConnectionFactory();
             con = SimpleUtils.getMqConnection(conFac);

             session = con.createSession(false,Session.AUTO_ACKNOWLEDGE);
             Assert.assertNotNull(session);
         }

}