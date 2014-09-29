package com.trax.IocDiAOP_basic.iocDi.impl;

import com.trax.IocDiAOP_basic.iocDi.interfaces.Performer;

/**
 * Created by SG0220142 on 7/31/2014.
 */
public class Juggler implements Performer{
    private int ballNos = 0 ;

    public  Juggler(){

    }

    public Juggler(int ballNos) {
        this.ballNos = ballNos;
    }

    @Override
    public void perform() {
        System.out.println("Juggler is performing !!");
        if(ballNos == 0 ){
            System.out.println("No constructor call");
        }else{
            System.out.println("Juggler is performing with " + ballNos + " balls.");
        }

    }

}
