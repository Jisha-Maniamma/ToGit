package com.Java.Class1.Tim_JavaExam.garden.vegitable.collectionJava.mapJava;

import java.util.TreeSet;

public class main {
    private static int length;
    public static void main(String[] args) {
//        List<String> taskNames=new ArrayList<>();
//        taskNames.add("s");
//        taskNames.add("c");
//TreeSet<String > s=new TreeSet<>(taskNames);
//        for(String Project:s) { System.out.println(Project);}


        ///////////



//        Person[] p=new Person[2];
//        p[0]=new Person("jj",30);
//        p[1]=new Person("gjj",3);
//        System.out.println(p[0].age+p[1].age);


        //System.out.println(cd1("aaabbbc"));
    }

//    class Person{
//        private String name;
//        private int age;
//
//        public Person(String name, int age) {
//            this.name = name;
//            this.age = age;
//        }
//    }
    public static String cd1(String test){
        int count;

       StringBuilder sb=new StringBuilder();
       try{
           char[] ch=test.toCharArray();
           for (int i=0;i<ch.length;i++){
                count=1;
//                if(ch)


           }

       }catch(NullPointerException nullExp){
          sb.append("Sorry there is no text value");

       }


       return sb.toString();
    }

    //
    public static void getValueMaxString(){
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
