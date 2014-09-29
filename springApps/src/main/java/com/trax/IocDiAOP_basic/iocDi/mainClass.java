package com.trax.IocDiAOP_basic.iocDi;

import com.trax.IocDiAOP_basic.iocDi.interfaces.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by SG0220142 on 7/31/2014.
 */
public class mainClass {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext_rough.xml");

        if (ctx == null) {
            System.out.println("Problem is creating context");
        }

        /*Performer juggler = (Performer)ctx.getBean("juggler");
        juggler.perform();

        Performer dukeJuggler = (Performer)ctx.getBean("duke");
        dukeJuggler.perform();*/

        //Performer poeticJuggler = (Performer) ctx.getBean("poeticduke");


       /* PoeticJuggler poeticJuggler = (PoeticJuggler) ctx.getBean("poeticduke");
        PoeticJuggler poeticJuggler2 = (PoeticJuggler) ctx.getBean("poeticduke");

        poeticJuggler.setTestFlag(10);

        System.out.println("==>poeticJuggler.." + poeticJuggler.hashCode() + "...... poeticJuggler2.." + poeticJuggler2.hashCode());
        System.out.println("*************"+poeticJuggler2.getTestFlag());*/

        //poeticJuggler.perform();

        //////////////Inner beans concept ////////
        //Performer insti = (Performer) ctx.getBean("mike");
        //insti.perform();

        ////////////Collection concept ///////////
        //Performer omb = (Performer) ctx.getBean("hank_onemanband");
        //omb.perform();

        //map in collections:::
        Performer perf = (Performer) ctx.getBean("hank_map_onemanband");
        perf.perform();



    }

}
