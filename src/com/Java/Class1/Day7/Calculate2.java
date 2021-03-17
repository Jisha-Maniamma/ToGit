package com.Java.Class1.Day7;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculate2 {  public static Scanner scan=new Scanner (System.in);

    public static void main(String[] args) {

        AddHolidays(LocalDate.of(2021,03,10) ,
                LocalDate.of(2021,03,12)
                ,LocalDate.of(2021,03,13)
                ,LocalDate.of(2021,03,15)


        );
        System.out.println("No. of holidays are "+dates.size());
        System.out.println("If saturday is not holiday in your company\tenter 1\nor else if saturday is a holiday\tenter 2\nif the holidays are random\tenter 3");
        int choice=scan.nextInt();
        scan.nextLine();
        System.out.println("......................................................................................");
        System.out.println("The dates in this year, exclusing holidays are... "+
                getBusinesdays(choice,LocalDate.of(2021,03,01),
                        LocalDate.of(2021,10,3))+
                " between "+LocalDate.of(2021,03,01)+" and "+LocalDate.of(2021,10,3));
        System.out.println("......................................................................................");
        AddDates(LocalDate.of(2021,04,06));
        System.out.println("one more day added to holiday: "+LocalDate.of(2020,04,06));
        System.out.println("No. of holiadys are "+dates.size());
        System.out.println("If saturday is not holiday in your company\tenter 1\nor else if saturday is a holiday\tenter 2\nif the holidays are random\tenter 3");
        choice=scan.nextInt();
        scan.nextLine();
        System.out.println("......................................................................................");

        System.out.println("The dates in this year, excluding holidays are... "+
                getBusinesdays(choice,LocalDate.of(2021,03,01),
                        LocalDate.of(2021,10,3))+
                " between "+LocalDate.of(2021,03,01)+" and "+LocalDate.of(2021,10,3));
        System.out.println("......................................................................................");

        /////////To print the list of holidays
//       for(LocalDate a:dates){
//           System.out.println(a);
//       }


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



    public static int getBusinesdays(int choice,LocalDate startDate, LocalDate endDate){
        System.out.println("Inside....calculator...No. of holidays are "+dates.size());
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
            case 3 :
                while(tempStartdate.isBefore(endDate) ) {
                    DayOfWeek day = tempStartdate.getDayOfWeek();
                    if (!dates.contains(tempStartdate) ) {
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