package com.Java.Class1.Day5;

import java.util.LinkedList;

public class Main_day5 {
    public static void main(String[] args) {
        LinkedList<String> projects=new LinkedList<>();
        projects.add("Project1");
        projects.add("Project2");
        projects.add("Project3");
        projects.addFirst("Project0");
        print(projects);
        System.out.println("-----------");

        System.out.println(projects.getFirst());
        System.out.println(projects.getLast());
        System.out.println(projects.getClass());
        System.out.println("-----------");

        String[] array1=new String[]{"P1","p2","p3","p4"};


        ArrayToList(array1);
        System.out.println("-----------");

    }

    public static void print(LinkedList<String> list){
        for(String a: list){
            System.out.println(a);

        }
    }

    public static void ArrayToList(String[] a){
        LinkedList<String> List=new LinkedList<>();
        for(String aa:a){
            List.add(aa);

        }
        print(List);
    }
}
