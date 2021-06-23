package com.Java.Class1.Day33;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/06/23 10:49
 */
public class Main {

    private static Date DateGenerate(LocalDate d){
        final int day=d.getDayOfMonth();
        final int month=d.getMonthValue();
        final int year=d.getYear();

        final Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        final Date result = calendar.getTime();
        return result;
    }

    private static Date date(final int day, final int month, final int year) {

        final Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        final Date result = calendar.getTime();
        return result;

    }


    public static void main(String[] args) {
        System.out.println(LocalDate.parse("2021-04-28"));
        System.out.println(DateGenerate(LocalDate.parse("2021-04-28")));
        System.out.println("........................");

        System.out.println(date(28,04,2021));
    }
}
