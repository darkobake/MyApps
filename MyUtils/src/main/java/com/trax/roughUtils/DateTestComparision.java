package com.trax.roughUtils;

import java.util.Date;

/**
 * Created by SG0220142 on 6/12/2014.
 */
public class DateTestComparision {

    public static void main(String[] args) {
        String a = "06/19/2014-06/19/2014";
        String b = "06/12/2014-06/12/2014";
        Date date1 = null;
        Date date2= null;
        if(a.contains("-")){
            date1 = new Date (a.split("-")[0]);
        }

        if(b.contains("-")){
            date2 = new Date (b.split("-")[0]);
        }

        System.out.println("===>" + (date1.compareTo(date2)));
    }
}
