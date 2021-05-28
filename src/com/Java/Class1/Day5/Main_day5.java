package com.Java.Class1.Day5;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.function.Consumer;

public class Main_day5 {
    public static void main(String[] args) {
        LinkedList<String> projects=new LinkedList<>();
        projects.add("Project1");
        projects.add("Project2");
        projects.add("Project3");
        projects.add("Project83");
        projects.add("Abkjbvjsv");
        projects.add("kvmv");
        projects.add("xcxbvcxb");
        projects.addFirst("Project0");
        print(projects);
      //  System.out.println("-----------");

        System.out.println(projects.getFirst());
        System.out.println(projects.getLast());
        System.out.println(projects.getClass());
        System.out.println("-----------");

        String[] array1=new String[]{"P1","p2","p3","p4"};


        ArrayToList(array1);
        System.out.println("-----------");

        ListToarray(projects);
        System.out.println("-----------");

        //To sort
        System.out.println("the sorted list is-");
        Collections.sort(projects);
        print(projects);

        ////////////////////////////////////////////////////////
        LinkedList<String> projectsNew=projects;
        LinkedList<String> projectsNew1=projects;
        LinkedList<String> projectsNew2=projectsNew;
        System.out.println("original list:"); print(projects);

        projectsNew.set(1,"ooooo");print(projectsNew);

        projectsNew1.add(1,"ooooo");print(projectsNew1);

        System.out.println("original list:"); print(projects);
        print(projectsNew2);
        ////////////////////////////////////////////////////////

        printUsingIterator(projects);




        //////////////////////////////////////////////
        ///////////////////28/5/2021//////////////////
        /////////////////////////////////////////////
        System.out.println();
        System.out.println("//////////////////////////////////////////////////");
        projects.forEach((n) -> System.out.println(n));


        System.out.println("//////////////////////////////////////////////////");
        Consumer<String> method=(n) -> System.out.println(n);
        projects.forEach(method);


    }

    public static void print(LinkedList<String> list){
        for(String a: list){
            System.out.println(a);

        } System.out.println("-----------");
    }

    public static void printUsingIterator(LinkedList<String> list){
        System.out.println("Using List Iterator the list is displayed as-");
        ListIterator<String> iterator= list.listIterator();
        System.out.println("FORWARD ");
        System.out.println();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }System.out.println("-----------");
        System.out.println("BACKWARD");
        System.out.println();
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println("-----------");
    }

/////////////Array to List////////////
    public static void ArrayToList(String[] a){
        LinkedList<String> List=new LinkedList<>();
        for(String aa:a){
            List.add(aa);

        }
        print(List);
    }
/////////////List to Array///////////////
    public static void ListToarray(LinkedList<String> list){
        String[] array=list.toArray(new String[list.size()]);
        for(String a:array){
            System.out.println(a);
        }

    }
}
