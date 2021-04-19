package com.Java.Class1.Day16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/04/20 8:43
 */
public class main {
    public static void main(String[] args) {
        DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date=LocalDate.now();
        System.out.println(date);
        String date1=date.format(df);
        System.out.println(date1+1);
        LocalDate date3=LocalDate.parse(date1);
        System.out.println(date3);
        //System.out.println(date1);
    }
}
