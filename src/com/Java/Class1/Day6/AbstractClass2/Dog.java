package com.Java.Class1.Day6.AbstractClass2;

public class Dog extends Animal{
Dog(String name){
    super(name);
}

    @Override
    public void eat() {
        System.out.println(getName()+ " is Chewing/eating food");
    }

    @Override
    public void breath() {
        System.out.println(getName()+" is breathing ");
    }




}
