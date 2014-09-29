package com.trax.dp.interfacepattern.facade;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by SG0220142 on 6/20/2014.
 */
public class TravelFacade {
    FlightBooker fb;
    HotelBooker hb;

    public Map<String,String> returnFlightHotelBooking(){
        List<String> flightList = fb.flightNames();
        List<String> hotelList = hb.hoteNames();

        Map<String,String> mapBooking = new HashMap<String, String>();
        mapBooking.put(flightList.get(0),hotelList.get(0));
        mapBooking.put(flightList.get(2),hotelList.get(2));

        return mapBooking;
    }

}
