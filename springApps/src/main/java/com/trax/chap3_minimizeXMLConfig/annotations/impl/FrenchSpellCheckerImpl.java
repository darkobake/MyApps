package com.trax.chap3_minimizeXMLConfig.annotations.impl;

import com.trax.chap3_minimizeXMLConfig.annotations.annotation.frenchCheckerAnnotation;
import com.trax.chap3_minimizeXMLConfig.annotations.interfaces.CheckSpelling;

/**
 * Created by SG0220142 on 8/8/2014.
 */
@frenchCheckerAnnotation
public class FrenchSpellCheckerImpl implements CheckSpelling{
    @Override
    public void checkSpelling() {
        System.out.println("Checking spelling in french ....");
    }
}
