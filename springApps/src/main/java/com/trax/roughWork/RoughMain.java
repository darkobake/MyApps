package com.trax.roughWork;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by SG0220142 on 7/29/2014.
 */
public class RoughMain {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext_rough.xml");
        System.out.println("Test print1!!!");
        if (ctx == null) {
            System.out.println("Context is null");
        } else {
            System.out.println("Context Created ...");
            System.out.println("Test print!!!");
            BeanNameAware awr = (BeanNameAware) ctx.getBean("awaretest");

            awr.finalWork();
        }
    }

}
