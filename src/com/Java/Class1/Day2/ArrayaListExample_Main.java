package com.Java.Class1.Day2;


public class ArrayaListExample_Main {
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
    // MobilePhone should do everything with Contact objects only.
    public static void main(String[] args) {

        System.out.println("welcome ..select...\n 1.To add contact to your phone\n 2.To update new Contact" +
                "\n 3.To modify contact name\n 4.To remove contact\n 5.To remove contact by contact name\n" +
                " 6.To find contact by name\n 7.To find contact ");

    }
}
