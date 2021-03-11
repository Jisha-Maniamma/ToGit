package com.Java.Class1.Day6;

public class Dog extends Animal{
    Dog(String name){
        super(name);
    }
    @Override
    public void eat() {
        System.out.println("Dog eats bone");
    }

}
