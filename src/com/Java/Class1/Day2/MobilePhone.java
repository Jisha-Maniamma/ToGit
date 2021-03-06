package com.Java.Class1.Day2;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    // Create a program that implements a simple mobile phone with the following capabilities.
    // Able to store, modify, remove and query contact names.
    private List<Contacts> mobilePhone;


    MobilePhone() {
        mobilePhone = new ArrayList<>();
    }

    //name number
    public void addContact(Contacts contact) {
        int number = contact.getNumber();
        if (!FindContact(number)) {
            mobilePhone.add(contact);
            System.out.println("The contact has been saved...");
        } else
            System.out.println("sorry this contact already exists");
    }

    public boolean modifyName(String oldname, String newname) {
        int i = FindContact(oldname);
        if ((i >= 0) && (FindContact(newname) < 0)) {
            mobilePhone.set(i, Contacts.addContact(newname, mobilePhone.get(i).getNumber()));
            return true;
        }
        return false;
    }

    public boolean modify(Contacts c1, Contacts c2) {
        int i = FindContact(c1);
        if (i >= 0) {
            mobilePhone.set(i, c2);
            return true;
        } else {
            System.out.println("sorry no such contact exixts");
            return false;
        }

    }

    public boolean removeContact(Contacts c1) {
        int i = FindContact(c1);
        if (i >= 0) {
        mobilePhone.remove(c1);
        return true;
        }
        return false;
    }
    public boolean removeContact(String name){
        int i=FindContact(name);
        if(FindContact(name)>=0){
            mobilePhone.remove(i);
            return true;
        }
        return false;
    }

    private int FindContact(String name) {
        for(int i=0;i<=mobilePhone.size();i++){
            if(mobilePhone.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public boolean Find(String name) {

            if(FindContact(name)>=0){
                return true;
            }

        return false;
    }

    public boolean FindContact(int number) {
        for(int i=0;i<=mobilePhone.size();i++){
            if(mobilePhone.get(i).getNumber()==number){
                return true;
            }
        }
        return false;
    }

    private int FindContact(Contacts c1) {
        return mobilePhone.indexOf(c1);
    }
    public boolean Find(Contacts c2){
        if(FindContact(c2)>=0){
            return true;
        }
        return false;
    }
}
