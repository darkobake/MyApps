package com.trax.IocDiAOP_basic.iocDi.Singleton;

/**
 * Created by SG0220142 on 8/1/2014.
 */
//Class to implement singleton classes into spring using static factory method
public class Stage {

    private Stage(){

    }

    private static class StageSingletonHolder{
        static Stage instance = new Stage();
    }

    public static Stage getInstance(){
        return StageSingletonHolder.instance;
    }

}
