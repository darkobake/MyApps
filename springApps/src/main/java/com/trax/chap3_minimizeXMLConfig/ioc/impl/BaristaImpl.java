package com.trax.chap3_minimizeXMLConfig.ioc.impl;

import com.trax.chap3_minimizeXMLConfig.ioc.interfaces.CoffeeShop;

/**
 * Created by SG0220142 on 8/8/2014.
 */
public class BaristaImpl implements CoffeeShop{

    public BaristaImpl() {
        System.out.println("Into Barista constructor...");
    }

    @Override
    public void takeOrder() {
        System.out.println("Barista is taking order...");
    }

    @Override
    public void serveOrder() {
        System.out.println("Barista is serving order");
    }
}
