package com.Java.Class1.Day30.a1;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/06/10 7:38
 */
public class main {
    public static void main(String[] args) {
        System.out.println("hai welcom to java");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number ");
        Long i=scan.nextLong();
        System.out.println("numberis "+i);
        scan.close();
        LocalDate d=LocalDate.of(2021,5,4);

        System.out.println("...............");
        System.out.println(d);
        System.out.println(d.withDayOfMonth(20));
        System.out.println(d.withMonth(10));
        System.out.println(d.withYear(1));
        System.out.println(d.withDayOfYear(29));
        LocalDate d1=LocalDate.now();
        System.out.println(d1);


        //date1,date2,date3,date4


        System.out.println(".....................");

    }
}
