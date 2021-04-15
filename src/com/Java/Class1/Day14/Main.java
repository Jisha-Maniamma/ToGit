package com.Java.Class1.Day14;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/04/12 13:19
 */
public class Main {
    public static final  LocalDateTime TODAYS_DATE=LocalDateTime.now();
    public static void main(String[] args) {

        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
        System.out.println("the first wrong date "+df.format(TODAYS_DATE));
        DateTimeFormatter df1=DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
        System.out.println(""+df1.format(TODAYS_DATE));


        System.out.println("...........................");

    }
}
