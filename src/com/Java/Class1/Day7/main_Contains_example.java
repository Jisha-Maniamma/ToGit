package com.Java.Class1.Day7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class main_Contains_example {
    public static void main(String[] args) {
        List<Human> p1=new ArrayList<>();
        p1.add(new Human(4,"jisha"));
        p1.add(new Human(5,"aaa"));
        p1.add(new Human(6,"bbb"));
        p1.add(new Human(7,"ddd"));
        p1.add(new Human(8,"ccc"));
        List<LocalDate> date=new ArrayList<>();
        date.add(LocalDate.of(2021,04,10));

        LocalDate startDate=LocalDate.of(2021,04,10);
        Human p=Human.setPerson(4,"jisha");
        containsORNot( p1, p);
        containsOrNot(date,startDate);
        containsOrNot(p1,"jisha");
    }
    private static void containsOrNot(List<Human> p1,String name){
        System.out.println(",,,,,,,,,,,,,,,,,,,,");
        for(Human h:p1){

            if(h.getName().equals(name)){
                System.out.println("yes this name of human in the list of humans");
            }
            else{
                System.out.println("no this name not in the list of humans");
            }
        }
    }
    private static void containsOrNot(List<LocalDate> date, LocalDate startDate) {
   if(date.contains(startDate)){
       System.out.println("yes this date in list of dates");
   }
   else {
       System.out.println("no this date not in list of dates");
   }
    }

    private static void containsORNot(List<Human> p1, Human p) {
        if( p1.contains(p)) {
            System.out.println("yes this human in list of humans");
        }
        else{
            System.out.println("no this human not in list of humans");
        }
    }



}
class Human{
    private int Age;
    private String name;

    public Human(int age, String name) {
        Age = age;
        this.name = name;
    }

    public static Human setPerson(int i, String jisha) {

    return new Human(i,jisha);
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}