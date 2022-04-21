package com.Java.Class1.Day45.Collection;

import java.util.HashMap;
import java.util.Map;

public class Mapp {
    public static void main(String[] args) {
        Map<String,String> lnguages =new HashMap<>();
        lnguages.put("Java","a compiled highlevel oops, platorm indepndent language");
        lnguages.put("Python","a intrpreter oops oops,dynamic semantics");
        lnguages.put("Algo","a intrpreter oops oops,dynamic semantics");
        System.out.println(lnguages.put("Algo","gggggggg"));
        System.out.println(lnguages.size());
        System.out.println(lnguages.get("Algo"));
        System.out.println(lnguages.containsKey("Java"));
        System.out.println(".............................................");
        for(String key: lnguages.keySet()){
            System.out.println(key+" :"+lnguages.get(key));
        }
        System.out.println(lnguages.remove("Python"));

        System.out.println(lnguages.remove("Algo","ggcfdfd"));
        //.replace(key,old,new) if not alrady null diplyed
        System.out.println(lnguages.replace("a","ggg"));
//        System.out.println(lnguages.replace("a","ggg","ggj"));
        System.out.println(".............................................");
        for(String key: lnguages.keySet()){
            System.out.println(key+" :"+lnguages.get(key));
        }
        System.out.println(lnguages.containsKey("Java")+".................");

        Map<String,String> lnguages1 =new HashMap<>(lnguages);
        System.out.println(lnguages1);

    }
}
