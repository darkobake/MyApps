package com.trax.chap3_minimizeXMLConfig.annotation_nobeans.impl;


import com.trax.chap3_minimizeXMLConfig.annotation_nobeans.interfaces.Performer;
import com.trax.chap3_minimizeXMLConfig.annotation_nobeans.interfaces.instrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by SG0220142 on 8/24/2014.
 */
@Component("eddie")
public class Instrumentalist implements Performer {
    @Autowired
    //@Qualifier("guitar") //use this to qualify
    private instrument instruments;

    @Override
    public void perform() {
        System.out.println("Eddie is performing...");
        instruments.play();
    }
}
