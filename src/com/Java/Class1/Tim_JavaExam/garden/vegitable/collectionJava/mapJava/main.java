package com.Java.Class1.Tim_JavaExam.garden.vegitable.collectionJava.mapJava;

import java.util.TreeSet;

public class main {
    private static int length;
    public static void main(String[] args) {
        String s="abcba";
        TreeSet<String> subStr=new TreeSet<>();
//        String  str;
        for (int i=0;i<=s.length();i++){
            for (int j=i;j<=s.length();j++) {
                String str = s.substring(i, j);
                //  length=str.length();
                if(length<=str.length()){
                    subStr.add(str);
                    length=str.length();}

            }



        }


        System.out.println(subStr);
        System.out.println(subStr.last());
    }
}
