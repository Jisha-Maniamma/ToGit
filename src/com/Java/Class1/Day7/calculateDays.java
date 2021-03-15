package com.Java.Class1.Day7;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class calculateDays {
    public static void main(String[] args) {
        AddHolidays(LocalDate.of(2021,01,02),LocalDate.of(2021,02,02));

        System.out.println("The dates in this year, exclusing holidays are... "+getBusinesdays(LocalDate.of(2021,01,01),LocalDate.of(2021,12,30)));
    }
    //    public static void main(String[] args) {
//    private static  Set<LocalDate> Holidays;
    private static List<LocalDate> dates;

    public static List<LocalDate> AddHolidays(LocalDate... datesInput){
//        dates= Arrays.asList(LocalDate.of(2021,02,10),LocalDate.of(2021,03,10));
        dates=new ArrayList<>();
        for(LocalDate NewDates:datesInput){

            dates.add(NewDates);
        }
//        Holidays= Set.copyOf(dates);

        return dates;
    }




    public static int getBusinesdays(LocalDate startDate, LocalDate endDate){
        if(startDate.isAfter(endDate)){
            throw new IllegalArgumentException("Sorry the dates must be checked for order");

        }
        int businessday=0;
        LocalDate tempStartdate=startDate;
        while(tempStartdate.isBefore(endDate) ){
            DayOfWeek day=tempStartdate.getDayOfWeek();
            if(!dates.contains(tempStartdate)&& day!=DayOfWeek.SUNDAY && day!=DayOfWeek.SATURDAY){
                businessday++;

            }
            tempStartdate=tempStartdate.plusDays(1);

        }
        return businessday;
    }

//    }
}
