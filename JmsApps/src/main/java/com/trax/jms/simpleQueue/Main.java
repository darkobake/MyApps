package com.trax.jms.simpleQueue;

import javax.jms.JMSException;
import java.io.IOException;

/**
 * Created by SG0220142 on 6/11/2014.
 */
public class Main {

    public static void main(String[] args) throws IOException, JMSException {
        Thread tProducer = new Thread(new Producer(),"Producer thread");
        System.out.println("Thread about to start....");
        tProducer.start();
        Thread tConsumer = new Thread(new Consumer());
        tConsumer.start();
    }

}
