package com.trax.roughUtils;

/**
 * Created by SG0220142 on 6/21/2014.
 */
public class ArgumentReader {

    public static String airlineCode_Code;
    public static String airlineCode;
    public static String flightDate_Code;
    public static String flightDate;
    public static String flightNumber_Code;
    public static Integer flightNumber;

    public static void main(String[] args) {
        //Program to read arguments
        printArguments(args);
        processArgumentList(args);

    }

    private static void printArguments(String[] args) {
        for(int i = 0;i<args.length;i++){
            System.out.print(args[i] + "\t");
        }
        System.out.println();
    }

    private static void processArgumentList(String[] args) {
        if(args == null || args.length ==0){
            throw new RuntimeException("No Arguments Present");
        }

        for(int i = 0;i<args.length;i++){
            if(args[i].equalsIgnoreCase("-airline")){
                airlineCode_Code = args[i];
                //ND Mode
                airlineCode = args[++i];
                if(args[i].equalsIgnoreCase("-flightdate")){
                    flightDate_Code = args[i];
                    flightDate = args[++i];

                }
                if(args[i].equalsIgnoreCase("-flightNumber")){
                    flightNumber_Code = args[i];
                    flightNumber = Integer.parseInt(args[++i]);
                }
            }

        }

    }
}
