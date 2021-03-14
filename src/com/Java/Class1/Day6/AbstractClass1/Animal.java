package com.Java.Class1.Day6.AbstractClass1;

public abstract class Animal {

private String name;
    public Animal(String name) {
        this.name = name;
    }
    public abstract void eat();
    public String getName() {
        return name;
    }
    public void sayHai(){
        System.out.println("Hi.. i am "+getName());
    }
}
