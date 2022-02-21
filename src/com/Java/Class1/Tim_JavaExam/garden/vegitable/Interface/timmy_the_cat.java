package com.Java.Class1.Tim_JavaExam.garden.vegitable.Interface;

public class timmy_the_cat {
    public static void main(String[] args) {
        cat c=new cat();
        System.out.println(c.age);
        c.Bark(12);
    }
}
class Animal{
    String name;
    int age=5;
    public Animal() {
        age++;
        System.out.println("no parameter Animal constructor");

    }


    public Animal(String name) {
        System.out.println("setting the Animal name");
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void Bark(){
        System.out.println(getName()+" barks more than "+100000+" times");

    }

    public void eat(){
        System.out.println(getName()+"...they eat");
    }
}
class cat extends Animal{
    public cat() {
        age--;
        System.out.println("no parametr cat canstructor");

    }
    @Override
    public void Bark(){
        super.Bark();
        System.out.println(getName()+" meows "+10+" times");

    }

    public void Bark(int times){
        super.Bark();
        System.out.println(getName()+" meows "+times+" times");

    }


    public cat(String name) {
        super(name);


        System.out.println("setting the cat name "+this.name);
    }
}
