package com.Java.Class1.Day6;

public class Main_day6  {

    public static void main(String[] args) {
        projects Business1=new BusinessProjects();
        projects IT1=new ITProjects();
        Business1.about();
        IT1.about();
        IT1.getName();
    }
}

abstract class projects{
    abstract void about();
    abstract void getName();

}

class BusinessProjects extends projects{

    void getName(){
        System.out.println("Business Project Name");
    }
    void about(){
        System.out.println("this is about Business projects");
    }
}
class ITProjects extends projects{
    void getName(){
        System.out.println("IT project name");
    }
    void about(){
        System.out.println("this is about IT projects");
    }
}