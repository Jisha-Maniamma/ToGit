package com.Java.Class1.Day49;

import java.util.*;

public class MaxRepeating {
    public static void main(String[] args) {
        int[] myArray=new int[]{12,2,2,5,4,6};

        findMax(myArray);

      sortASC(myArray);

      reducebyOne(5);

        String text="LeetCode is one of the most well-known online judge platforms that you can use to practice your programming skills by solving coding questions. It has over 1,100 different problems, support for over 18 programming languages, and languages an languages languages languages active community that is always there to help you with the solutions you come up up up up up up up up up up up  with.";
        text=text.replaceAll("[-,.]","");
        List<String> inputText= Arrays.asList(text.split(" "));
        System.out.println(inputText);
        findMaxRepeatingString1(inputText);
        System.out.println("...............");
        findDistinctString(Arrays.asList(new String[]{"a","b","a","a"}));
        System.out.println(".........................................");
        findOccurance(inputText);
    }

    private static void findOccurance(List<String> asList) {
        int count=0;
        Map<String,Integer> mySet=new TreeMap<>();
        for(int i=0;i<asList.size();i++){
            count=1;
            for(int j=i+1;j<asList.size();j++) {
                if(asList.get(i).equals(asList.get(j))){
                    count++;
                }

            }
            if(count>0){
                mySet.put(asList.get(i),mySet.get(asList.get(i))==null?1:mySet.get(asList.get(i))+count );
            }
            }
      //  System.out.println(mySet);
        List<Map.Entry<String,Integer>> answer=new ArrayList<>(mySet.entrySet());
        System.out.println(answer);
       Collections.sort(answer, new Comparator<Map.Entry<String, Integer>>() {
           @Override
           public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
               return o1.getValue().compareTo(o2.getValue());
           }
       });
        System.out.println(answer);

    }

    private static void findDistinctString(List<String> inputText) {

        for(int i=0;i<inputText.size();i++){
            int j=0;
            for(j=0;j<inputText.size();j++) {
                System.out.println(i+" "+j);
                if(inputText.get(i).equals(inputText.get(j)))
                {
                    break;
                }

            }
            if(i==j){
                System.out.println(inputText.get(i));
            }
            }
    }

    private static void findMaxRepeatingString1(List<String> inputText) {

        int count=0;
        int texmpMax=0;
        String number="";
        for(int i=0;i<inputText.size();i++){
            count=0;
            for(int j=i+1;j<inputText.size();j++) {

                if(inputText.get(i).equals(inputText.get(j)))
                {                    count++;
                }
            }
            if(texmpMax<count){
                texmpMax=count;
                number=inputText.get(i);
            }
            }
        System.out.println("maximum repeating word is "+number);
    }

    private static void reducebyOne(int i) {
        if(i>0) {
            reducebyOne(i - 1);
            System.out.println("a "+i);
        }
        System.out.println("th value of i is "+i);
    }

    private static void sortASC(int[] array) {
        int minimum=array[0];
        int temp=0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    minimum=array[j];
                   temp= array[i];
                   array[i]=minimum;
                    array[j]=temp;
                }
            }

        }
        for(int b:array){
            System.out.println(b);
        }
    }

    public static void findMax(int[] array){
        int count=0;
        int temp=0;
        int number=0;
        for(int i=0;i<array.length;i++){
            count=0;
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    count++;
                }


            }
            if(count>temp){
                temp=count;
                number=array[i];
            }
        }
        System.out.println("the answer is "+number);
    }
}
