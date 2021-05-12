package com.Java.Class1.Day18;

import java.util.Arrays;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/05/11 12:45
 */
public class Arrayexampl {
    public static void main(String[] args) {
        int[] array1=new int[5];
        int[] checkArray=array1;
        int[] array2={5,4,6,4};
        int[] array3=new int[]{4,5,6,8,9,1,0,2};


        int a=12;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        b++;
        System.out.println(a);
        System.out.println(b);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(checkArray));

        array1[3]=5;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(checkArray));

        String s1=new String("haiii   ");
        String s2=s1;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        s2=s1+"aa";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1+"....");
        System.out.println(s2+"....");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        dereferenceArray(checkArray);
        System.out.println(array1.hashCode());
        System.out.println(checkArray.hashCode());
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(checkArray));

        System.out.println(s1.substring(4));
        System.out.println("///////////////////////////");

    }

    private static void dereferenceArray(int[] array){
        array=new int[]{1,1,1,1,1,1,1,1,1};
    }
//    public static int[] printArray(int[] array){
//        for(int i=0;i<array.length;i++){
//
//        }
//
//
//    }
}
