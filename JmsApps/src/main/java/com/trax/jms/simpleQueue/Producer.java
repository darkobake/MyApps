package com.trax.jms.simpleQueue;

import com.trax.jms.utils.SimpleUtils;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import java.io.IOException;
import java.util.Date;

/**
 * Created by SG0220142 on 6/11/2014.
 */
public class Producer implements Runnable{

    private ActiveMQConnectionFactory connectionFactory = null;
    private Connection con = null;
    private Session session = null;
    private String queueName = null;





    private final String PROPS_FILE_NAME = "mq.properties";

    public Producer() throws JMSException,IOException{
        connectionFactory = SimpleUtils.getConnectionFactory();
        //connectionFactory = new ActiveMQConnectionFactory("admin","admin", "failover://tcp://10.0.0.5:61616");
        con = SimpleUtils.getMqConnection(connectionFactory);
        queueName= SimpleUtils.mqProperties("simple.queue.name");
     }


    @Override
    public void run() {
        try {
            System.out.println("Thread started !!!");
            con.start(); //start connection
            //session = SimpleUtils.getSession(con); //get session from connection
            session = con.createSession(false,Session.AUTO_ACKNOWLEDGE); //get session from connection
            Destination dest = session.createQueue(queueName); //create a destination of type queue / topic


            MessageProducer producer = session.createProducer(dest); //create a producer
            int messageCounter = 0;

            while(messageCounter <10 ){

                String textMessage = "Message produced by ... "+Thread.currentThread().getName() +"...Time..." + new Date().getTime();
                TextMessage tMessage = session.createTextMessage(textMessage);
                System.out.println("Message sent to queue :::" + textMessage);
                producer.send(tMessage);

                try {
                    Thread.sleep(50000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                messageCounter ++;
            }

            killObjects();



        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

    private void killObjects() {
        try {
            session.close();
            con.close();
        } catch (JMSException e) {
            e.printStackTrace();
        }

    }
}
