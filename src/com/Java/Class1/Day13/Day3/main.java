package com.Java.Class1.Day13.Day3;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/04/01 9:27
 */
public class main {
    public static void main(String[] args) {
        Long a1=Long.valueOf(13);
        Long a2=Long.valueOf(13);
        System.out.println(a1==a2);

        Long b1=Long.valueOf(127);
        Long b2=Long.valueOf(127);
        System.out.println(b1==b2);

        Long c1=Long.parseLong("1.2");
        System.out.println(c1);
    }
}
