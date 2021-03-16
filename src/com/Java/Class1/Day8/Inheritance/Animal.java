package com.Java.Class1.Day8.Inheritance;

public class Animal extends Beings {

    //even constrctor zaruri nahi hae
    public Animal() {
        System.out.println("they exist for sure");
    }

    public void Offspings(){
        System.out.println("they give birth to offsprings");
    }
}
class Beings{
    public Beings(){
        System.out.println("they exist");
    }
    public void sit(){
        System.out.println("May be livimg/non-living....all specie can make sound");
    }
        }
