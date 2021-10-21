package com.Java.Class1.Day42.ListChallenge1;


import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit=new LinkedList<>();
//        placesToVisit.add("a");
//        placesToVisit.add("e");
//        placesToVisit.add("c");
//        placesToVisit.add("b");
//        placesToVisit.add("d");
//        placesToVisit.add("f");
//
//        placesToVisitAdd(placesToVisit);
//        placesToVisit.add(1,"jp");
//        placesToVisitAdd(placesToVisit);
//        placesToVisit.remove(2);
//        placesToVisitAdd(placesToVisit);
        System.out.println("...........................................");
        inOrder(placesToVisit,"sydney");
        inOrder(placesToVisit,"mel");
        inOrder(placesToVisit,"bri");
        inOrder(placesToVisit,"per");
        inOrder(placesToVisit,"can");
        inOrder(placesToVisit,"ade");
        inOrder(placesToVisit,"dar");
        placesToVisitAdd(placesToVisit);
    }

    public static void placesToVisitAdd(@NotNull LinkedList<String> places){
        Iterator<String> i=places.listIterator();
        while(i.hasNext()){
            System.out.println("Now visiting "+i.next());
        }
        System.out.println("=========================");
//        for(String a:places){
//            System.out.println(a);
//        }

    }
    private static boolean inOrder(LinkedList<String> places ,String newCity){

        ListIterator<String> i=places.listIterator();
        while(i.hasNext()){
           int comparision=i.next().compareTo(newCity);
           if(comparision==0){
               System.out.println("this place is already in list");
               return false;
           }
           if(comparision>0){
               i.previous();
               i.add(newCity);
               return true;
           }
           if(comparision<0){
           }

        }
        i.add(newCity);
        return true;
    }
}
