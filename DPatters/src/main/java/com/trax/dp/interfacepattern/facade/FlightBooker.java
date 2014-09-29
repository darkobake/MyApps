package com.trax.dp.interfacepattern.facade;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SG0220142 on 6/20/2014.
 */
public class FlightBooker {
    public List<String> flightNames(){
        List<String> flightList = new ArrayList<String>(2);
        flightList.add("DEL-BLR");
        flightList.add("MUM-BLR");

        return flightList;
    }

}
