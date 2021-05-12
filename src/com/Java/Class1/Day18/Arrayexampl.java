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
        int[] array2;
        array2= new int[]{5, 4, 6, 4};
        int[] array5={1,2,3,2,3,23};
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

        array1=new int[]{1,2,3};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(checkArray));
        System.out.println("///////////////////////////");
        String s1=new String("haiii   ");
        String s2=s1;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        s1.replace("i","a");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        s1=s1.replace("i","a");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println("///////////////////////////");
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

        Double d1= Double.valueOf("1.05");
        Double d2=d1;
        System.out.println(d1==d2);
        System.out.println(d1.equals(d2));

        d2=.005;

        System.out.println(d1==d2);
        System.out.println(d1.equals(d2));
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
