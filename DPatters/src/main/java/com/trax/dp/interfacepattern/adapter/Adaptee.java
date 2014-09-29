package com.trax.dp.interfacepattern.adapter;


import javax.servlet.http.HttpSession;
import java.util.Collections;
import java.util.List;

/**
 * Created by SG0220142 on 6/20/2014.
 */
public class Adaptee {

    public List<Integer> sort(List<Integer> number) {

        List<Integer> sortedNumber = number;
        Collections.sort(sortedNumber);

        return sortedNumber;

    }
}
