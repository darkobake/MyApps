package com.trax.roughUtils;

/**
 * Created by SG0220142 on 7/23/2014.
 */
public class NumberFinder {

    public static void main(String[] args) {
        String regEx = "(?<=[\\w&&\\D])(?=\\d)";
        String test = "SU123ERTYHU7789";

        String numberEx = "[^A-Z0-9]+|(?<=[A-Z])(?=[0-9])|(?<=[0-9])(?=[A-Z])";
        System.out.println("..."+test.split(numberEx).length);

    }

}
