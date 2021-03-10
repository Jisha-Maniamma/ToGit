package com.Java.Class1.Day6;

public class Main_day6 extends projects {
    void status(){
        System.out.println("This is the abstract class method declared inside extended class "+getClass().getMethods().toString());
    }
    public static void main(String[] args) {
projects p1=new Main_day6();
p1.status();
    }
}

abstract class projects{
    abstract void status();
}