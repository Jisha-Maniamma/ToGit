package com.Java.Class1.Day6;

public abstract class Dog extends Animal{
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
}
class RajapalayamDog extends Dog{
RajapalayamDog(String name){
    super(name);
}
    @Override
    public void Hunt() {
        System.out.println(getName()+"- I am cute , But i can Hunt");
    }

}
