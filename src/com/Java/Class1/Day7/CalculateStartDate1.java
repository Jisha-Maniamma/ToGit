package com.Java.Class1.Day7;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/03/19 11:26
 */
public class CalculateStartDate1 {
    public static void main(String[] args) {
        calcul(LocalDate.of(2021,03,22),1);
        //  calcul1(LocalDate.of(2021,04,17),34);
    }


    private static LocalDate calcul(LocalDate enddate, double days){

        int TypeOfHoliday=1;

        LocalDate end=enddate;
        System.out.println("Original end date= "+end);


                //saturday and sunday
                for(int i=1;i<=days;i++) {
                    end = end.minusDays(1);
                    if ( CalculateStartDate.dates.contains(end) || end.getDayOfWeek() == DayOfWeek.SUNDAY || end.getDayOfWeek() == DayOfWeek.SATURDAY) {
                        // System.out.println("************** **************** reduce time: "+i+" the date is now "+end);
                        end = end.minusDays(1);
                        //   System.out.println("weekend");
                    }
                }




        System.out.println("........................................");
        System.out.println("The scheduled start start date is= "+end);
        return  end;
    }


    private static LocalDate calcul1(LocalDate enddate, double days){

        int TypeOfHoliday=1;

        LocalDate end=enddate;
        System.out.println("Original end date= "+end);

        //  System.out.println("Not weekend "+end);
        switch(TypeOfHoliday){
//            case 3:
//                //random
//                for(int i=1;i<=days;i++) {
//                    end = end.minusDays(1);
//                    if (!containsOrNot(AddHolidays.holidays, end)) {
//                        end = end.minusDays(1);
//                        //   System.out.println("weekend");
//                    }
//                }break;
            case 1:
                //saturday and sunday
                for(int i=0;i<=days;i++) {
                    end = end.minusDays(1);
                    if ( !(containsOrNot(calculateDays.dates, end)) || end.getDayOfWeek() == DayOfWeek.SUNDAY || end.getDayOfWeek() == DayOfWeek.SATURDAY) {
                        // System.out.println("************** **************** reduce time: "+i+" the date is now "+end);
                        end = end.minusDays(1);
                        //   System.out.println("weekend");
                    }
                }break;
//            case 2:
//                //only sunday
//                for( int i=1;i<=days;i++){
//                    end= end.minusDays(1);
//                    if( !containsOrNot(AddHolidays.holidays,end) || end.getDayOfWeek()== DayOfWeek.SUNDAY ){
//                        end=end.minusDays(1);
//                        //   System.out.println("weekend");
//                    }
//                }
//                break;
            default:
                break;

        }




        System.out.println("........................................");
        System.out.println("The scheduled start start date is= "+end);
        return  end;
    }


    private static boolean containsOrNot(List<LocalDate> dates, LocalDate tempStartdate) {
        for(int i = 0; i< CalculateStartDate.dates.size(); i++){

            //System.out.println("******"+h.getDate()+"******");
            if(CalculateStartDate.dates.contains(tempStartdate)){
                System.out.println("........holiday......"+tempStartdate);
                return true;}
            else{
                System.out.println("........not holiday......"+tempStartdate);
            }

        }
        return false;


}}
