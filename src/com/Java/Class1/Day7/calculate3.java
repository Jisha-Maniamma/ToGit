package com.Java.Class1.Day7;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class calculate3 {
    public static void main(String[] args) {

        List<Person> p1=new ArrayList<Person>();
        p1.add(new Person(4,"jisha"));
        p1.add(new Person(5,"krishna"));

        ObservableList<Person> p= FXCollections.observableArrayList(p1);
        System.out.println(p.get(0).getName()+" "+p.get(1).getName());
    }
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