package com.Java.Class1.Day7;

import java.util.ArrayList;
import java.util.List;

public class calculate3 {
    List<Person> p1=new ArrayList<>();
    p1.add();
}
class Person{
    private int Age;
    private String name;

    public Person(int age, String name) {
        Age = age;
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}