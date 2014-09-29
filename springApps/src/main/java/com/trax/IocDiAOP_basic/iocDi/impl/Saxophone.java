package com.trax.IocDiAOP_basic.iocDi.impl;

import com.trax.IocDiAOP_basic.iocDi.interfaces.Instrument;

/**
 * Created by SG0220142 on 8/2/2014.
 */
public class Saxophone implements Instrument{
    @Override
    public void paly() {
        System.out.println("Saxophone Playing");
    }




}
