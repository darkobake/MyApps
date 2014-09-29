package com.trax.dp.interfacepattern.facade;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SG0220142 on 6/20/2014.
 */
public class HotelBooker {
    public List<String> hoteNames(){
        List<String> hotelList = new ArrayList<String>(2);
        hotelList.add("Omega");
        hotelList.add("Delta");

        return hotelList;
    }
}
