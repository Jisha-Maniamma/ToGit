package com.Java.Class1.Day6.AbstractClass2;

public abstract class Animal{
    private String name;

    Animal(String name){
        this.name=name;
    }

    public abstract void eat();
    public abstract void breath();

    public String getName(){
        return this.name;

    }


}
