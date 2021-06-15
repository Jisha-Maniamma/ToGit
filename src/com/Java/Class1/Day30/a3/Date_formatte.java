package com.Java.Class1.Day30.a3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/06/15 7:13
 */
public class Date_formatte {

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        LocalDate date1=LocalDate.of(2021,03,02);
        LocalDate date2=LocalDate.parse("2021-02-06");
        Period p1=Period.of(10,11,2);
        LocalDate date3=date1.minus(p1);
        System.out.println(date3);
        DateTimeFormatter df1=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        DateTimeFormatter df2=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSS");
        DateTimeFormatter df3=DateTimeFormatter.ISO_DATE;
        String date6=df1.format(date1);
        String date7=date1.format(df1);
        System.out.println(date6);
        System.out.println(date7);

        String date4="2021/03/06";
        date4=date4.replace('/','-');
        System.out.println(date4);
        LocalDate date5=LocalDate.parse(date4,df3);
        System.out.println(date5);

        System.out.println(".....................");
        DateTimeFormatter df11=DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime DateNow=LocalDateTime.now();

        System.out.println((df11.format(DateNow)));

      //  DateTimeFormatter formatter=DateTimeFormatter.of
        System.out.println("......................................");


        System.out.println();
        System.out.println(" ");

    }
}
