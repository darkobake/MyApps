package com.trax.utils.fileUtils;

import org.omg.CORBA.Environment;

import java.io.File;
import java.io.InputStream;

/**
 * Created by Tushar Bisht
 * Program to read file from class path
 */
public class ClassPathFileFinder {


    public static boolean classPathFileFinder(String fileName){


        ClassLoader classLoader = Thread.currentThread()
                .getContextClassLoader();

        System.out
                .println("Class loader to string:::" + classLoader.toString());

        InputStream ios = null;
        String stripped = fileName.startsWith("/") ? fileName.substring(1)
                : fileName;

        System.out.println("Stripped name::"+stripped);

        if (classLoader != null) {
            ios = classLoader.getResourceAsStream(stripped);
        }
        if (ios == null) {
            ios = Environment.class.getResourceAsStream(fileName);
        }

        System.out.println("Stream status===" + (ios == null));
        //System.out.println("File size::"+ios);


        return true;
    }

    public static void main(String[] args) {
        classPathFileFinder("temp.txt");
    }

}
