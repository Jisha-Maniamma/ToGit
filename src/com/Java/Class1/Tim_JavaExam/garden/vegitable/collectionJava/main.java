package com.Java.Class1.Tim_JavaExam.garden.vegitable.collectionJava;

import java.util.*;

public class main {
    public static void main(String[] args) {
        System.out.println(args.length);
        List<Integer> a=new ArrayList<>();

        a.add(21);
        a.add(53);
        a.add(22);
        a.add(21);
        a.add(593);
        a.add(2);
        a.add(1);
        a.add(3);
        a.add(12);
        a.add(11);
        a.add(73);
        a.add(202);
        List<String> aS=new ArrayList<>();
        aS.add("jp");
        aS.add("a");  aS.add("jp");  aS.add("jp1");

        TreeSet<Integer> sorted=new TreeSet<>(a);
        TreeSet<String> sS=new TreeSet<>(aS);
        sS.remove("jp");
        System.out.println(sS);
        System.out.println(sS.contains("jp"));
        //////////////////////


        SortedSet<String> s=new TreeSet<>();
        s.add("bb");
        s.add("aa");

        Iterator i=s.iterator();
        System.out.println(s);
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
