package com.trax.dp.interfacepattern.adapter;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by SG0220142 on 6/20/2014.
 */
public class SorterAdapterInterfaceImpl implements SorterAdapterInterface {
    @Override
    public int[] sort(int[] numbers) {

        List<Integer> integerNumber = new ArrayList<Integer>(numbers.length);
        for(int i=0;i<numbers.length;i++){
            Integer x = numbers[i];
            integerNumber.add(x);
        }
        return convertToIntArray(sortNumbers(integerNumber));
    }

    private int[] convertToIntArray(List<Integer> integerNumber) {
      int[] intArray = new int[integerNumber.size()];
      int counter = 0;
      for(Integer x : integerNumber){
          intArray[counter] = x;
          counter++;
      }
        return intArray;
    }

    private List<Integer> sortNumbers(List<Integer> integerNumber) {

        Adaptee adaptee = new Adaptee();

        return adaptee.sort(integerNumber);

    }
}
