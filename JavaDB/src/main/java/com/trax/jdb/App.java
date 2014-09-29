package com.trax.jdb;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException {

                String OLA1 = "abcd'*'*'*'*oa*l**a";
        System.out.println("===>"+OLA1.replaceAll("a\\*","@:@"));
        //System.out.println("===>"+OLA1.replaceAll("'*","@:@"));

    }
}
