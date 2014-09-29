package com.trax.IocDiAOP_basic.iocDi.impl;

import com.trax.IocDiAOP_basic.iocDi.interfaces.Poem;

/**
 * Created by SG0220142 on 7/31/2014.
 */
public class Poet implements Poem{
    @Override
    public void recite() {
        System.out.println("Recieting Poem");
    }
}
