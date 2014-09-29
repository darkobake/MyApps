package com.trax.roughUtils;

/**
 * Created by SG0220142 on 9/29/2014.
 */
public class Templar {

    private static String name = "Tushar";
    public static int age = 19;

    private class inner1{
        //private static int loop;  -- not legal
        public void printer(){
            System.out.println("NAme ... "  + name + "..age ..."+age);
        }
    }


    private static class inner2{
        //use static as well as non static

        public  void printer(){
            System.out.println("NAme ... "  + name + "..age ..."+age);
        }
    }

    public static void main(String[] args) {
        //Templar.inner2().printer();

        Templar.inner2 y = new Templar.inner2();

        Templar.inner1 x = new Templar().new inner1();
        x.printer();
    }

}
