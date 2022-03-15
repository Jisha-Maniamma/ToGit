package com.Java.Class1.practiceQuestions;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Mazon2 {
    public static void main(String[] args) {
        List<String> places=new LinkedList<>();
        places.add("A1");
        places.add("A4");
        places.add("A2");
        places.add("A3");
        Collections.sort(places);
        System.out.println(places);
        ListIterator<String> iter=places.listIterator();
        while(iter.hasNext())
//            if(iter.next().compareTo("Aa2")<0){
//                places.add("Aa2");
//            }
            System.out.println(iter.next());
    }
}
