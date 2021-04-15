package com.Java.Class1.Day7;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class calculateDays {
    public static Scanner scan=new Scanner (System.in);

    public static void main(String[] args) {

        AddHolidays(LocalDate.of(2020,01,01) ,
                LocalDate.of(2020,01,02)
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
                ,LocalDate.of(2020,12,31)
                ,LocalDate.of(2021,03,19)
                ,LocalDate.of(2021,03,17)
                ,LocalDate.of(2021,04,10)
                ,LocalDate.of(2021,04,02)



        );
        System.out.println("No. of holidays are "+dates.size());
        System.out.println("If saturday is not holiday in your company\tenter 1\nor else if saturday is a holiday\tenter 2\nif the holidays are random\tenter 3");
        int choice=scan.nextInt();
        scan.nextLine();
        System.out.println("......................................................................................");
        System.out.println("The dates in this year, exclusing holidays are... "+
                getBusinesdays(choice,LocalDate.of(2020,03,01),
                        LocalDate.of(2021,10,3))+
                " between "+LocalDate.of(2020,03,01)+" and "+LocalDate.of(2021,10,3));
        System.out.println("......................................................................................");
        AddDates(LocalDate.of(2020,04,06));
        System.out.println("one more day added to holiday: "+LocalDate.of(2020,04,06));
        System.out.println("No. of holiadys are "+dates.size());
        System.out.println("If saturday is not holiday in your company\tenter 1\nor else if saturday is a holiday\tenter 2\nif the holidays are random\tenter 3");
        choice=scan.nextInt();
        scan.nextLine();
        System.out.println("......................................................................................");

        System.out.println("The dates in this year, excluding holidays are... "+
                getBusinesdays(choice,LocalDate.of(2020,03,19),
                        LocalDate.of(2020,03,22))+
                " between "+LocalDate.of(2020,03,19)+" and "+LocalDate.of(2020,03,22));
        System.out.println("......................................................................................");
        System.out.println("**********************Saturday and sunday****************");
        System.out.println( getBusinesdays(2,LocalDate.of(2020,12,8),
                LocalDate.of(2021,05,10))+
                " between "+LocalDate.of(2021,05,10)+" and "+LocalDate.of(2020,12,8));
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

    private static boolean ContainsOr(LocalDate date){
        for(LocalDate h:dates){
            //  System.out.println("******"+h+"******");
            if(h.getYear()==date.getYear() && h.getDayOfYear()==date.getDayOfYear()){
                // System.out.println("........holiday......"+date);
                return true;}
        }
        return false;
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
                    if (!ContainsOr(tempStartdate)  && day != DayOfWeek.SUNDAY) {
                        System.out.println("its not Holiday "+tempStartdate +" "+tempStartdate.getDayOfWeek()); businessDay++;

                    }else if(dates.contains(tempStartdate)){
                        System.out.println("its Holiday "+tempStartdate +" "+tempStartdate.getDayOfWeek());
                    }
                    tempStartdate = tempStartdate.plusDays(1);
                }

                break;
            case 2 :
                while(tempStartdate.isBefore(endDate) ) {
                    DayOfWeek day = tempStartdate.getDayOfWeek();
                    if (!ContainsOr(tempStartdate)  && day!=DayOfWeek.SATURDAY && day != DayOfWeek.SUNDAY) {
                        System.out.println("its not Holiday "+tempStartdate +" "+tempStartdate.getDayOfWeek());businessDay++;

                    }else {
                        System.out.println("its Holiday "+tempStartdate +" "+tempStartdate.getDayOfWeek());// System.out.println("yes...............................................Holiday");
                    }
                    tempStartdate = tempStartdate.plusDays(1);
                }
                break;
            case 3 :
                while(tempStartdate.isBefore(endDate) ) {
                    DayOfWeek day = tempStartdate.getDayOfWeek();
                    if (!dates.contains(tempStartdate) ) {
                        System.out.println("its not Holiday "+tempStartdate +" "+tempStartdate.getDayOfWeek()); businessDay++;

                    }else if(dates.contains(tempStartdate)){
                        System.out.println("its Holiday "+tempStartdate +" "+tempStartdate.getDayOfWeek());
                    }
                    tempStartdate = tempStartdate.plusDays(1);
                }
                break;
            default:

                break;
        }
        return businessDay;
    }
//    private static boolean ContainsOr(LocalDate date){
//        for(LocalDate h:dates){
//
//            //  System.out.println("******"+h+"******");
//            if(h.getDayOfYear()==date.getDayOfYear()){
//                // System.out.println("........holiday......"+date);
//                return true;}
//
//        }
//        return false;
//
//
//    }
//    }
}
