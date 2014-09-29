package com.trax.jms.simpleQueue;

import com.trax.jms.utils.SimpleUtils;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import java.io.IOException;

/**
 * Created by SG0220142 on 6/11/2014.
 */
public class Consumer implements Runnable{

    private ActiveMQConnectionFactory connectionFactory = null;
    private Connection con = null;
    private Session session = null;
    private String queueName = null;

    public Consumer() throws JMSException, IOException {
        connectionFactory = SimpleUtils.getConnectionFactory();
        //connectionFactory = new ActiveMQConnectionFactory("admin","admin", "failover://tcp://10.0.0.5:61616");
        con = SimpleUtils.getMqConnection(connectionFactory);
        queueName= SimpleUtils.mqProperties("simple.queue.name");
    }

    @Override
    public void run() {

        try{
            System.out.println("Consumer thread started ...");
            con.start(); //start connection
            //session = SimpleUtils.getSession(con); //get session from connection
            session = con.createSession(false,Session.AUTO_ACKNOWLEDGE); //get session from connection
            Destination dest = session.createQueue(queueName); //create a destination of type queue / topic

            MessageConsumer consumer = session.createConsumer(dest);

            int count = 0;
            while(count < 10){
                Message message = consumer.receive(1000);
                if(message instanceof TextMessage){
                    TextMessage txt = (TextMessage) message;
                    String text =txt.getText();
                    System.out.println("Text recieved :::" + text);
                    count ++;
                }
            }

            consumer.close();
            session.close();
            con.close();

        }catch(JMSException e){
            e.printStackTrace();
        }

    }


}
