package com.Java.Class1.Day6.AbstractClass2;

public class Bird extends Animal implements CanFly{
    Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is pecking on food");
    }

    @Override
    public void breath() {
        System.out.println(getName()+" is breathing...");

    }
    @Override
    public void fly(){
        System.out.println("Opened my wings.....");
    }

}
