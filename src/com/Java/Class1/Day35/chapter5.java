package com.Java.Class1.Day35;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/07/05 7:07
 */
public class chapter5 {
    public static void main(String[] args) {
        int[] a=new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=i;
            if((a[i]%2)==0)
                a[i]=20;
        }
        for (int b:a) {
            System.out.println(b+=2);
        }
        System.out.println("////////////////////");
        for (int b:a) {
            System.out.println(b);
        }

        System.out.println("////////////////////");
        int i=10;
        do
            while(++i <15)
            //    System.out.println(i);
                i=i+20;
               // System.out.println(i+" is");}
        while (i<2);
        System.out.println(i);
        System.out.println("/////////////////");


        ///infinite loop
//        for(;;){
//            System.out.println(i);
//            System.out.println("haiiii");
//        }
    }
}
