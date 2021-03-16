package com.Java.Class1.Day8.Inheritance1;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public void Bark(){
        System.out.println(getName()+" barks more than "+a+" times");

    }

}
