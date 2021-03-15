package com.Java.Class1.Day7;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class calculateDays {
    public static void main(String[] args) {

        AddHolidays(LocalDate.of(2020,01,01) ,LocalDate.of(2020,01,02)
                ,LocalDate.of(2020,01,03)
                ,LocalDate.of(2020,05,04)
                ,LocalDate.of(2020,05,05)
                ,LocalDate.of(2020,05,06)
                ,LocalDate.of(2020,05,07)
                ,LocalDate.of(2020,05,8)
                ,LocalDate.of(2020,07,23)
                ,LocalDate.of(2020,07,24)
                ,LocalDate.of(2020,8,10)
                ,LocalDate.of(2020,8,11)
                ,LocalDate.of(2020,8,12)
                ,LocalDate.of(2020,8,13)
                ,LocalDate.of(2020,8,14)
                ,LocalDate.of(2020,9,21)
                ,LocalDate.of(2020,12,30)
                ,LocalDate.of(2020,12,31)

        );
        System.out.println("No. of holiadys are "+dates.size());
        System.out.println("The dates in this year, exclusing holidays are... "+getBusinesdays(2,LocalDate.of(2020,04,01),LocalDate.of(2020,8,3)));
    }




    private static List<LocalDate> dates;





    public static List<LocalDate> AddHolidays(LocalDate... datesInput){
        dates=new ArrayList<>();
        for(LocalDate NewDates:datesInput){

            dates.add(NewDates);
        }
        return dates;
    }




    public static int getBusinesdays(int choice,LocalDate startDate, LocalDate endDate){
        if(startDate.isAfter(endDate)){
            throw new IllegalArgumentException("Sorry the dates must be checked for order");
        }
        int businessDay=0;
        LocalDate tempStartdate=startDate;

        switch(choice){
            case 1:
                while(tempStartdate.isBefore(endDate) ) {
                    DayOfWeek day = tempStartdate.getDayOfWeek();
                    if (!dates.contains(tempStartdate)  && day != DayOfWeek.SUNDAY) {
                        businessDay++;

                    }
                    tempStartdate = tempStartdate.plusDays(1);
                }

                break;
            case 2 :
                while(tempStartdate.isBefore(endDate) ) {
                    DayOfWeek day = tempStartdate.getDayOfWeek();
                    if (!dates.contains(tempStartdate)  && day!=DayOfWeek.SATURDAY && day != DayOfWeek.SUNDAY) {
                        businessDay++;

                    }
                    tempStartdate = tempStartdate.plusDays(1);
                }
                break;
            default:

                break;
        }
        return businessDay;
    }

//    }
}
