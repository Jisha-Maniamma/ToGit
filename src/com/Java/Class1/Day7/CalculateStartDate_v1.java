package com.Java.Class1.Day7;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/03/19 15:30
 */
public class CalculateStartDate_v1 {
    public static void main(String[] args) {
        calcul(LocalDate.of(2021,03,22),5);
        //  calcul1(LocalDate.of(2021,04,17),34);
    }

    private static void calcul(LocalDate Enddate, int i) {
        LocalDate end=Enddate;
        int days=i;
        System.out.println("...To reduce no. of days: "+days+" From date: "+end+"...");
        int ii=0;
        for(;ii<=days;){

            if(end.getDayOfWeek()== DayOfWeek.SATURDAY || end.getDayOfWeek()==DayOfWeek.SUNDAY ){
                System.out.println("Weekend");end=end.minusDays(1);

            }
            else{
                System.out.println("not weekend " +end);
                end=end.minusDays(1);
                ii++;
            }
        }
        System.out.println(end.plusDays(1));

    }
}
