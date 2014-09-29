package com.trax.chap3_minimizeXMLConfig.annotations.impl;

import com.trax.chap3_minimizeXMLConfig.annotations.interfaces.CheckSpelling;

/**
 * Created by SG0220142 on 8/8/2014.
 */
public class EnglishSpellCheckerImpl implements CheckSpelling{

    public EnglishSpellCheckerImpl() {
        System.out.println("Inside spell checker constructor....");
    }

    public void checkSpelling() {
        System.out.println("I am now checking the spelling...");
    }
}
