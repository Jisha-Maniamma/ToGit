package com.Java.Class1.Day17.program1;

/**
 * This is a polymorphism example
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/04/23 8:34
 */
public class class1 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        cat cat=new cat();
        Animal animalDog=new Dog();
        Animal animalCat=new cat();

        System.out.println("********************");
        check.findSound(dog);
        check.findSound(cat);
        check.findSound(dog);
        check.findSound(animalDog);
        check.findSound(animalCat);
        System.out.println("********************");
    }
}
class check{
    public static void findSound(Animal animal){
        animal.sound();
    }
}
class Dog extends Animal{

    @Override
    public void sound() {
        System.out.println("woof!!!");
    }
}
class cat extends  Animal{

    @Override
    public void sound() {
        System.out.println("meow!!!");
    }
}
abstract class Animal{
    public abstract void sound();
}