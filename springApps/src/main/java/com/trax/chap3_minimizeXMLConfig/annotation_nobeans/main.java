package com.trax.chap3_minimizeXMLConfig.annotation_nobeans;

import com.trax.chap3_minimizeXMLConfig.annotation_nobeans.interfaces.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by SG0220142 on 8/24/2014.
 */
public class main {
    public static void main(String[] args) {
        ApplicationContext cntx = new ClassPathXmlApplicationContext("applicationContest_annotation_nobeans.xml");
        Performer perf = (Performer)cntx.getBean("eddie");
        perf.perform();
    }
}
