package com.Java.Class1.Tim_JavaExam.garden.vegitable.Interface;

public class Interface_main extends Cats{
    @Override
    public void animalSound() {

    }

    @Override
    public void sleep() {

    }

    @Override
    void a() {

    }

    @Override
    public void animalSound1() {

    }
}
interface About_Animal{
    int a=10;
    static int b=100;
    public void animalSound();
    public void sleep();
    static void eats(){
        System.out.println("animal eats");
    }
    default void runs(){
        System.out.println("animal runs");
    }


}
interface B{

    public void animalSound1();
        }
interface C extends B,About_Animal{

}
abstract class Bb{

}
abstract class Cc{

}

abstract class Cats  extends Cc implements C{
    abstract  void a();

}