package com.Java.Class1.narowing;

public class Narrowing_1 {
    static char myChar;
    static  byte myByte;
    static short myShort;
    static int myInt;
    static String myString;
    static  Long myLong;
    static float myFloat;
    static double myDouble;
    public static void main(String[] args) {


        System.out.println("///////////////// DEFAULT VALUE ///////////////////");

        System.out.println("myChar -> "+myChar);
        System.out.println("myByte -> "+myByte);
        System.out.println("myShort -> "+myShort);
        System.out.println("myInt -> "+myInt);
        System.out.println("myString -> "+myString);
        System.out.println("myLong -> "+myLong);
        System.out.println("myFloat -> "+myFloat);
        System.out.println("myDouble -> "+myDouble);


        System.out.println("///////////////// USER DEFINED ///////////////////");

        myChar=1;
        myByte=1;
        myShort=1;
         myInt=1;
         myString="1";
        myLong=1L;
        myFloat=1;
        myDouble=1;
        System.out.println("myChar -> "+myChar);
        System.out.println("myByte -> "+myByte);
        System.out.println("myShort -> "+myShort);
        System.out.println("myInt -> "+myInt);
        System.out.println("myString -> "+myString);
        System.out.println("myLong -> "+myLong);
        System.out.println("myFloat -> "+myFloat);
        System.out.println("myDouble -> "+myDouble);

        System.out.println("///////////////// USER DEFINED ///////////////////");
        myChar=1;
        myByte=1;
        myShort=1;
        myInt=1;
        myString="1";
        myLong=1L;
        myFloat=1;
        myDouble=1;






        myByte= (byte) (myShort= (short) (myChar= (char) (myInt= (int) (myFloat= (float) (myDouble=myLong=1L)))));

        //widening

        myDouble=myFloat=myLong;
        myByte=(byte)myChar;

        //narrowing
        myLong=(long)myDouble;

        myChar=(char)myByte;
        System.out.println("..............................................................");
        System.out.println(Character.MIN_VALUE+0); System.out.println(Character.MAX_VALUE+0);
        System.out.println(Byte.MIN_VALUE); System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE); System.out.println(Short.MAX_VALUE);

    }
}
