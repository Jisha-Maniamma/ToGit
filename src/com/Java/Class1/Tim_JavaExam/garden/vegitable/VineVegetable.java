package com.Java.Class1.Tim_JavaExam.garden.vegitable;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class VineVegetable {
    public static void main(String[] args) {
        System.out.println("vegetable grows on vine");
        String value="-1";
        System.out.println(Double.parseDouble(value)<0);

        String date="";
        System.out.println( date==""?null:LocalDate.parse(date));


        System.out.println(LocalDateTime.now().toLocalDate());

        System.out.println(Math.round(1.0000000000005 * 100D) / 100D);

    }

}
