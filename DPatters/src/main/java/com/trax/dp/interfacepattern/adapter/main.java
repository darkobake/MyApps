package com.trax.dp.interfacepattern.adapter;

import java.util.Random;

/**
 * Created by SG0220142 on 6/20/2014.
 */
public class main {

    public static void main(String[] args) {
        int[] randomIntNumbers = generateRandomNumbers();
        displayNumbers(randomIntNumbers);
        //Adaptee adaptee = new Adaptee();

        SorterAdapterInterface sorter = new SorterAdapterInterfaceImpl();
        randomIntNumbers = sorter.sort(randomIntNumbers);

        displayNumbers(randomIntNumbers);


    }

    private static void displayNumbers(int[] randomIntNumbers) {
        for(int i = 0 ; i<randomIntNumbers.length;i++){
            System.out.print(randomIntNumbers[i] + ",\t");

        }
        System.out.println();
    }

    private static int[] generateRandomNumbers() {

        int[] randomIntNumbers = new int[100];
        Random random = new Random();

        for(int i=0;i<100;i++){
            randomIntNumbers[i] = random.nextInt();

        }
        return randomIntNumbers;

    }


}
