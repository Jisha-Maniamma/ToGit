package com.Java.Class1.Day6;

public class Main_Abstract {
    public static void main(String[] args) {

        Dog MyDog = new pugDog("Tommy");
        MyDog.eat();
        MyDog.Hunt();

        Dog SomeOneDog=new RajapalayamDog("Huntter");
        SomeOneDog.eat();
        SomeOneDog.Hunt();

    }
}
