package com.Java.Class1.Day6.AbstractClass2;

public class maain {

    public static void main(String[] args) {
        Bird p1=new Parrot("Indian parrot");
        p1.breath();
        p1.fly();
        System.out.println("...............");
        Bird p2=new Penguin("King penguin");
        p2.breath();
        p2.fly();
    }
}
