package com.Java.Class1.Day13.Day4;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/04/02 8:26
 */
public class Main {
    public static void main(String[] args) {
        String s1=new String("Juntos Project");
        String s2=new String("Juntos Project");
        Boolean b1=new Boolean(true);
        Boolean b2=new Boolean("true");
        Boolean b3=true;
        Boolean b4=Boolean.valueOf(true);
        System.out.println(b3==b4);
        System.out.println(b1==b2);
        System.out.println(b2==b4);
        System.out.println("**********************");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
