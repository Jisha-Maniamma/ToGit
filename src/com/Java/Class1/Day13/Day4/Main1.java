package com.Java.Class1.Day13.Day4;

import java.time.ZonedDateTime;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/04/08 10:40
 */
public class Main1 {
    public static void main(String[] k) {

        k= new String[]{"one","two"};

        System.out.println("first value is: "+k[0]+", Second value is: "+k[1]);

        System.out.println(k instanceof Object);

        ZonedDateTime date=ZonedDateTime.now();
        System.out.println(date);
    }
}
