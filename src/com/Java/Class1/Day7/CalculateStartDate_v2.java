package com.Java.Class1.Day7;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/03/22 8:19
 */
public class CalculateStartDate_v2 {
    public static void main(String[] args) {
        AddHolidays(LocalDate.of(2020,01,02) ,
                LocalDate.of(2020,01,02)
                ,LocalDate.of(2020,01,03)
                ,LocalDate.of(2020,05,04)
                ,LocalDate.of(2020,05,05)
                ,LocalDate.of(2020,05,06)
                ,LocalDate.of(2020,05,07)
                ,LocalDate.of(2020,05,8)
                ,LocalDate.of(2021,03,17)
                ,LocalDate.of(2021,03,18)
                ,LocalDate.of(2020,8,10)
                ,LocalDate.of(2020,8,11)
                ,LocalDate.of(2020,8,12)
                ,LocalDate.of(2020,8,13)
                ,LocalDate.of(2020,8,14)
                ,LocalDate.of(2020,9,21)
                ,LocalDate.of(2020,12,30)
                ,LocalDate.of(2020,12,31)

        );
        System.out.println("***************** Sunday and saturday off ***************");
        calcul(1,LocalDate.of(2021,05,10),5);
        System.out.println();
        System.out.println("***************** sunday off ***************");
        calcul(2,LocalDate.of(2021,05,10),5);
        System.out.println();
        System.out.println("***************** Random off ***************");
        calcul(3,LocalDate.of(2021,05,10),5);
        //  calcul1(LocalDate.of(2021,04,17),34);
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


    private static void calcul(int choice,LocalDate Enddate, double i) {
        LocalDate end=Enddate;
        double days=i;
        System.out.println("...To reduce.... no. of date: "+days+"..... From Milestone date: "+end+"...");
        System.out.println("Number of holidays "+dates.size());
        switch (choice){
            case 1:
                //sunday and saturday
                for(int ii=0;ii<=days;){

                    if(dates.contains(end) ||end.getDayOfWeek()== DayOfWeek.SATURDAY || end.getDayOfWeek()==DayOfWeek.SUNDAY ){
                        // System.out.println("Weekend "+end);
                        end=end.minusDays(1);

                    }
                    else{
                        // System.out.println("not weekend " +end);
                        end=end.minusDays(1);
                        ii++;
                    }
                }
                System.out.println("Scheduld start date is "+end.plusDays(1));
                break;
            case 2:
                //only sunday
                for(int ii=0;ii<=days;){

                    if(dates.contains(end) || end.getDayOfWeek()==DayOfWeek.SUNDAY ){
                        // System.out.println("Weekend "+end);
                        end=end.minusDays(1);

                    }
                    else{
                        // System.out.println("not weekend " +end);
                        end=end.minusDays(1);
                        ii++;
                    }
                }
                System.out.println("Scheduld start date is "+end.plusDays(1));
                break;
            case 3:

                //random
                for(int ii=0;ii<=days;){

                    if(dates.contains(end) ){
                        // System.out.println("Weekend "+end);
                        end=end.minusDays(1);

                    }
                    else{
                        // System.out.println("not weekend " +end);
                        end=end.minusDays(1);
                        ii++;
                    }
                }
                System.out.println("Scheduld start date is "+end.plusDays(1));
                break;

        }


    }
}
