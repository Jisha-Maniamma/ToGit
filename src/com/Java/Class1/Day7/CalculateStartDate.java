package com.Java.Class1.Day7;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CalculateStartDate {
    public static void main(String[] args) {
        AddHolidays(LocalDate.of(2021,03,12) ,
                LocalDate.of(2021,03,03)


        );
        System.out.println("Holidays are- ");
        for (LocalDate a:dates){
            System.out.println(a);
        }
        System.out.println("........................................");
      calcul(LocalDate.of(2021,03,16),4);
    }


    public static List<LocalDate> dates=new ArrayList<>();





    public static List<LocalDate> AddHolidays(LocalDate... datesInput){

        for(LocalDate NewDates:datesInput){

            dates.add(NewDates);
        }
        return dates;
    }

    public static List<LocalDate> AddDates(LocalDate date1){

        dates.add(date1);
        return dates;
    }


    private static void calcul(LocalDate enddate, int days){
       LocalDate end=enddate;
        System.out.println("Original end date= "+end);
        for(int i=1;i<=days;i++){
            end= end.minusDays(1);
          //  System.out.println("Not weekend "+end);
            if( dates.contains(end) || end.getDayOfWeek()== DayOfWeek.SUNDAY ||  end.getDayOfWeek()== DayOfWeek.SATURDAY){
                end=end.minusDays(1);
             //   System.out.println("weekend");
            }
        }
        System.out.println("........................................");
        System.out.println("The scheduled start start date is= "+end);

    }
}
