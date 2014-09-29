package com.trax.chap3_minimizeXMLConfig.annotation_nobeans.impl;

import com.trax.chap3_minimizeXMLConfig.annotation_nobeans.interfaces.instrument;
import org.springframework.stereotype.Component;

/**
 * Created by SG0220142 on 8/24/2014.
 */
@Component
public class Guitar implements instrument {
    @Override
    public void play() {
        System.out.println("Playing Guitar.....");
    }
}
