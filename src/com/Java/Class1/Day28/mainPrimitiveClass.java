package com.Java.Class1.Day28;

import java.time.LocalDate;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/06/07 7:18
 */
public class mainPrimitiveClass {

    public static void main(String...args) {
        System.out.println("Java");

        String i=new String("2Hai");
        System.out.println(i);
        modify(i);
        System.out.println(i);
        i=modify(i);
        System.out.println(i);

        LocalDate start=LocalDate.of(2021,8,8);
        Project p1=new Project("Tokyo",start);



    }

    private static String modify(String i) {
        return i.concat("123");
    }



}
 class Project{
    private String projectname;
    private LocalDate StartDate;
    Project(){

    }
    Project(String projectname,LocalDate Startdate){
        System.out.println();
    }
    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public LocalDate getStartDate() {
        return StartDate;
    }

    public void setStartDate(LocalDate startDate) {
        StartDate = startDate;
    }
}