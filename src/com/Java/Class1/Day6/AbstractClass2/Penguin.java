package com.Java.Class1.Day6.AbstractClass2;

public class Penguin extends  Bird{
    Penguin(String name) {
        super(name);
    }

    @Override
    public void fly(){
        super.fly();
        System.out.println("I cannot fly but instead i can swim");
    }
}
