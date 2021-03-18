package com.Java.Class1.Day7;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class calculate3 {
    /*
    *  public static void main(String[] args) {
         ObservableList<Device> list = FXCollections.<Device>observableArrayList();
         Device data1 = new Device(1);
         Device anotherData1 = new Device(1);
         list.add(data1);
         System.out.println(list.contains(data1)); // true
         System.out.println(list.contains(anotherData1)); // false
     }
     */
    public static List<LocalDate> dates=new ArrayList<>();

    public static   List<Person> p1=new ArrayList<Person>();
    public static   List<Person> p2=new ArrayList<Person>();

    public static void main(String[] args) {


        p1.add(new Person("jisha"));
        p1.add(new Person("krishna"));

        //////////////list to observable list/////////////////////
        p2=FXCollections.observableArrayList();
        ObservableList<Person> p= FXCollections.observableArrayList(p1);
        p2=p;
        System.out.println(p.get(0).getName()+" "+p.get(1).getName());
        ///////////////////////////////////

        Person person=new Person("jisha");
        for(Person pp: p1){
            if(pp.getName().contains("jisha")){
                System.out.println("yes...name in the list");
            }
        }

        for(Person pp:p){
            if(pp.getName().contains("jisha")){
                System.out.println("yes...name in the observabl list");
            }
        }
        for(Person pp:p2){
            //  System.out.println("hai");
            System.out.println(pp.getName());
        }
        p1=FXCollections.observableArrayList();
        System.out.println(p1.size());

    }
}
class Person{
    private int Age;
    private String name;

    public Person(int age, String name) {
        Age = age;
        this.name = name;
    }

    public Person(String name) {
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