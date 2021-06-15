package com.Java.Class1.Day29.v1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/06/08 8:02
 */
public class Main {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {

        String projectName=new String("Project kyushu");
        String a="Project kyushu";
        System.out.println(projectName.equals("Project kyushu"));
a=a.concat("zz");
        System.out.println(a);


        StringBuffer buffer=new StringBuffer("hello");
        buffer.append("java");
        System.out.println(buffer);



        StringBuilder builder=new StringBuilder("hello");
        builder.append("java");
        System.out.println(builder);

        System.out.println();
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime d=LocalDateTime.now();
        System.out.println(d.format(df));

        System.out.println();
        LocalDate startdate=LocalDate.of(2021,06,20);
        int da=startdate.getDayOfWeek().getValue();
        LocalDate displaydate = startdate.minusDays(7).minusDays(da).plusDays(1);
        System.out.println("project pipeline start ==> "+startdate);
        System.out.println("Actual display date    ==> "+displaydate);
        System.out.println("display date           ==> "+displaydate.getDayOfMonth());


        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,");

String a1="project";
        String a2=a1+"project";
        String a3="projectproject";
        System.out.println(a2==a3);


        String a4="ad";
        String a6="a";
        String a5=a6+"d";
        String a7="a"+"d";
        System.out.println(a4==a5);
        System.out.println(a4==a7);
        System.out.println(a5==a7);

        System.out.println(a4+" "+a5+" "+a7);
    }
}
