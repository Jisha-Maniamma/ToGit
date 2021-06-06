package com.Java.Class1.Day28;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/06/07 7:18
 */
public class mainPrimitiveClass {

    public static void main(String...args) {
        System.out.println("Java");

        String i=new String("2Hai");
        System.out.println(i);
        modify(i);
        System.out.println(i);
        i=modify(i);
        System.out.println(i);
    }

    private static String modify(String i) {
       return i.concat("123");
    }

//    public static void modify(String i){
//
//    }
}
