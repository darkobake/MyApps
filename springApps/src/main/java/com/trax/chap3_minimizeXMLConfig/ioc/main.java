package com.trax.chap3_minimizeXMLConfig.ioc;

import com.trax.chap3_minimizeXMLConfig.ioc.normalClasses.CoffeeBarMenu;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by SG0220142 on 8/8/2014.
 */
public class main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext_annotation.xml");
        CoffeeBarMenu menu = (CoffeeBarMenu) ctx.getBean("barmenu");

        menu.showMenuOpen();
    }

}
