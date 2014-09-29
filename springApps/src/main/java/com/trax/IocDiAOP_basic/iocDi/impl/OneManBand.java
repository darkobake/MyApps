package com.trax.IocDiAOP_basic.iocDi.impl;

import com.trax.IocDiAOP_basic.iocDi.interfaces.Instrument;
import com.trax.IocDiAOP_basic.iocDi.interfaces.Performer;
import lombok.Setter;

import java.util.Collection;
import java.util.Map;
import java.util.Properties;


/**
 * Created by SG0220142 on 8/2/2014.
 */

//Class demonstrating uses of collection in Spring
public class OneManBand implements Performer{

    @Setter
    private Collection <Instrument>instruments;

    @Setter
    private Map<String,Instrument> instrumentsMap;

    @Setter
    private Properties instrumentsprops;

    public OneManBand() {
    }

    //method shows performance with maps
    @Override
    public void perform() {
        for(String key : instrumentsMap.keySet()){
            System.out.println("Now playing with " + key);
            instrumentsMap.get(key).paly();
        }
    }


   /*
   //Method shows performance with list and set
   @Override
    public void perform() {
        for(Instrument ins : instruments){
            System.out.println("One mand band playing ... " );
            ins.paly();
        }
    }*/
}
