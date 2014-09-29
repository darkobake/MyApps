package com.trax.IocDiAOP_basic.iocDi.impl;

import com.trax.IocDiAOP_basic.iocDi.interfaces.Poem;
import lombok.Getter;

/**
 * Created by SG0220142 on 7/31/2014.
 */
/*

Class to show constructor argruments with object
Also has a init and destpry method
 */

public class PoeticJuggler extends Juggler{
    private Poem poet;
    @Getter
    private int testFlag = 0 ;

    public PoeticJuggler(Poem poet) {
        super();
        this.poet = poet;
    }

    public PoeticJuggler(int ballNos, Poem poet) {
        super(ballNos);
        this.poet = poet;
    }

    public void perform(){
        super.perform();
        System.out.println("Recieting poem...");
        poet.recite();
    }

    public void setTestFlag(int x){
        this.testFlag = x;
    }


    public void initMethod(){
        System.out.println("The artist is starting performance ... start clapping");
    }

    public void destroyMethod(){
        System.out.println("The artist has finished performing ... start clapping");
    }

}
