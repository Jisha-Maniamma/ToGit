package com.Java.Class1.Day42.challngearaylist;

import java.util.Scanner;

public class Main {
    public static Scanner scan=new Scanner(System.in);

    private static MobilePhone JishasPhone=new MobilePhone();
    public static void main(String[] args) {
        // Create a program that implements a simple mobile phone with the following capabilities.
        // Able to store, modify, remove and query contact names.
        // You will want to create a separate class for Contacts (name and phone number).
        // Create a master class (MobilePhone) that holds the ArrayList of Contacts
        // The MobilePhone class has the functionality listed above.
        // Add a menu of options that are available.
        // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
        // and search/find contact.
        // When adding or updating be sure to check if the contact already exists (use name)
        // Be sure not to expose the inner workings of the Arraylist to MobilePhone
        // e.g. no ints, no .get(i) etc
        // MobilePhone should do everything with Contact objects only.s

        System.out.println("please enter name to save");
        String name=scan.nextLine();
        System.out.println("please enter number to save");
        String number=scan.nextLine();
//contacts newContact=new contacts(name,number);
        JishasPhone.StoreConatct(name,number);
        System.out.println(JishasPhone.myContacts.size());
        System.out.println("please enter name to save");
         name=scan.nextLine();
        System.out.println("please enter number to save");
         number=scan.nextLine();
//contacts newContact=new contacts(name,number);
        JishasPhone.StoreConatct(name,number);
        System.out.println(JishasPhone.myContacts.size());
    }
}
