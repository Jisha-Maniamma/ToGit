package com.Java.Class1.Day2;

public class Contacts {
    // You will want to create a separate class for Contacts (name and phone number).

    private String name;
    private int number;
    Contacts(String name,int number){
        this.name=name;
        this.number=number;
    }

    public static Contacts addContact(String name,int number){
        return new Contacts(name,number);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
