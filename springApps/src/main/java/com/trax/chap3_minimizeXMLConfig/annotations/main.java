package com.trax.chap3_minimizeXMLConfig.annotations;

import com.trax.chap3_minimizeXMLConfig.annotations.normalCLasses.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by SG0220142 on 8/8/2014.
 */
public class main {


    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext_annotation.xml");

        if(ctx == null){
            System.out.println("No context found !!!");
        }else{
            TextEditor te = (TextEditor)ctx.getBean("teditor");
            te.checkSpelling();
        }

    }

}
