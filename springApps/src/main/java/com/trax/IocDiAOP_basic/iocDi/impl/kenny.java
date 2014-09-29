package com.trax.IocDiAOP_basic.iocDi.impl;

import com.trax.IocDiAOP_basic.iocDi.interfaces.Instrument;
import com.trax.IocDiAOP_basic.iocDi.interfaces.Performer;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by SG0220142 on 8/1/2014.
 */

//demonstration of injecting into properties (getter setter injection using DI
public class kenny implements Performer{

    @Getter@Setter
    private String song;
    @Setter
    private Instrument instrument;


    public kenny() {
    }

    public kenny(String song, Instrument instrument) {
        this.song = song;
        this.instrument = instrument;
    }

    @Override
    public void perform() {
        System.out.println("Playing song ... " + song);
        instrument.paly();
    }
}
