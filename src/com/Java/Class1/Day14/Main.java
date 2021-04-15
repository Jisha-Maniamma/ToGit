package com.Java.Class1.Day14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/04/12 13:19
 */
public class Main {
    public static final  LocalDateTime TODAYS_DATE=LocalDateTime.now();
    public static void main(String[] args) {

        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
        System.out.println("the first wrong date "+df.format(TODAYS_DATE));
        DateTimeFormatter df1=DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
        System.out.println(""+df1.format(TODAYS_DATE));


        System.out.println("...........................");
        System.out.println(" Obtaining some basic info ");
        System.out.println("...........................");
        LocalDate date1=LocalDate.of(2021,01,01);
        LocalDate date2=LocalDate.parse("2020-01-03");
        System.out.println(date1.getYear());
        System.out.println(date1.getDayOfYear());
        System.out.println(date1.getChronology());
        System.out.println(date1.getDayOfWeek());
        System.out.println("...........................");

        System.out.println("\n");

        System.out.println("...........................");
        Project project_SW=new Project("Max");
//        Project Bridge_okinawa=new Project();


    }
}
class Project{
    private String name;

    public Project(String name) {
        this.name = name;
    }

//    public void setName(String inputName){
//        this.name=inputName;
//    }

    public String getName(){
        return this.name;
    }
}
