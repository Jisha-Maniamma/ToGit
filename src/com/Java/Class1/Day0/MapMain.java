package com.Java.Class1.Day0;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
public static Map<String,Integer> myMap=new HashMap<>();

    public static void main(String[] args) {
        System.out.println("................");

        myMap.put("Project-A",1);
        myMap.put("Project-A",5);
        System.out.println(myMap.get("Project-A"));
        myMap.put("Projct-A",myMap.get("Projct-A")!=null?myMap.get("Project-A")+1:1);
        System.out.println(myMap);
    }
}
