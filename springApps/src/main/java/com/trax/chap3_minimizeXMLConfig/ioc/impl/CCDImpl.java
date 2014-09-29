package com.trax.chap3_minimizeXMLConfig.ioc.impl;

import com.trax.chap3_minimizeXMLConfig.ioc.interfaces.CoffeeShop;

/**
 * Created by SG0220142 on 8/8/2014.
 */
public class CCDImpl implements CoffeeShop{

    public CCDImpl() {
        System.out.println("Into CCD constructor...");
    }

    @Override
    public void takeOrder() {
        System.out.println("CCD is taking order...");
    }

    @Override
    public void serveOrder() {
        System.out.println("CCD is serving order");
    }
}
