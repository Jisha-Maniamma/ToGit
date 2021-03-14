package com.Java.Class1.Day6.AbstractClass1;

public abstract class Dog extends Animal implements MakesSound {
    Dog(String name){
        super(name);
    }
    @Override
    public void eat() {
        System.out.println(getName()+" eats bone");
    }
    public abstract void Hunt();

}

class pugDog extends Dog{

pugDog(String name){
    super(name);

}
    @Override
    public void Hunt() {
        System.out.println(getName()+"- I am cute and i cannot hunt");
    }

    @Override
    public void barks() {
        System.out.println("barks bowww");
    }
}
class RajapalayamDog extends Dog{
RajapalayamDog(String name){
    super(name);
}
    @Override
    public void Hunt() {
        System.out.println(getName()+"- I am cute , But i can Hunt");
    }

    @Override
    public void barks() {
        System.out.println("bark Boww! Boww!");
    }
}
