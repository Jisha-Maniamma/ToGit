package com.Java.Class1.Day8.Inheritance1;

public class Animal {
    protected int a=100;
    private String name;
    public Animal(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(getName()+"...they eat");
    }
}
