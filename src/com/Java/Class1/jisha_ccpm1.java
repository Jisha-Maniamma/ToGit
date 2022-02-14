package com.Java.Class1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class jisha_ccpm1 {


    public static void main(String[] args) {
       List<LocalDate> dates=new ArrayList<>();
       dates.clear();
       dates.add(LocalDate.parse("2022-01-25"));
        dates.add(LocalDate.parse("2022-01-26"));
        dates.add(LocalDate.parse("2022-01-27"));
        dates.add(LocalDate.parse("2022-01-31"));
        dates.add(LocalDate.parse("2022-02-01"));
        dates.add(LocalDate.parse("2022-02-04"));


        System.out.println(dates.get(dates.size()-1));
dates.clear();
        System.out.println(dates.size());

        var a=new Jisha_ccpm();
        a.main(args);
    }
}