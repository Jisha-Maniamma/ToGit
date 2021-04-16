package com.Java.Class1.Day13.Day4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/04/08 10:40
 */
public class Main1 {
    private static final LocalDateTime TODAYS_DATE=LocalDateTime.now();
    public static void main(String[] k) {

        k= new String[]{"one","two"};

        System.out.println("first value is: "+k[0]+", Second value is: "+k[1]);

        System.out.println(k instanceof Object);

        LocalDate date1=LocalDate.now();

        ZonedDateTime now=ZonedDateTime.now();
        ZonedDateTime nextRun = now.withHour(5).withMinute(0).withSecond(0);
        System.out.println(nextRun);
        System.out.println(now);
        System.out.println(now.compareTo(nextRun));
        if(now.compareTo(nextRun) > 0)
            nextRun = nextRun.plusDays(1);

        System.out.println(nextRun);
        System.out.println(".............");
        LocalDate presseddate=LocalDate.now();
        LocalDate nextUpdateLimit=presseddate.plusDays(1);
        System.out.println(presseddate);
        System.out.println(nextUpdateLimit);
        System.out.println("**************************************************************");
        //int lastday=sett
        System.out.println(TODAYS_DATE);
        System.out.println("**************************************************************");
        DateTimeFormatter df=DateTimeFormatter.ofPattern("DD-mm-yyyy HH:mm:ss");
        System.out.println(df.format(TODAYS_DATE));
        System.out.println("**************************************************************");
        System.out.println();
        System.out.println("......Debugger Excercise........");
        System.out.println();
        System.out.println("**************************************************************");

        System.out.println("**************************************************************");


    }
}
