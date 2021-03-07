package com.Java.Class1.Day2;


import java.util.Scanner;

public class ArrayaListExample_Main {
    public static MobilePhone mobilephone = new MobilePhone();
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
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {

            System.out.println("welcome ..select...\n 1.To add contact to your phone\n 2.To update to new Contact" +
                    "\n 3.To modify contact name\n 4.To remove contact\n 5.To remove contact by contact name\n" +
                    " 6.To find contact by name\n 7.To find contact by number\n 8.Quit");

            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    Addcontact();
                    break;
                case 2:
                    UpdateContact();
                    break;
                case 3:
                    ModifyName();
                    break;
                case 4:
                    RemoveContact();
                    break;
                case 5:
                    RemoveByName();
                    break;
                case 6:
                    FindByName();
                    break;
                case 7:
                    FindContactNumber();
                    break;
                case 8:
                    flag = false;
                    break;
                default:
                    System.out.println("Select out of the given list");
                    break;
            }
        }


    }

    private static void RemoveContact() {

    }

    private static void ModifyName() {

    }

    private static void UpdateContact() {
        System.out.println("Enter the contact name you wish to change ");
        String oldname = scan.nextLine();
        //scan.nextLine();
        //System.out.println("you have entered " + oldname);
        System.out.println("Enter the phone number");
        int numold = scan.nextInt();
        scan.nextLine();
        //System.out.println("you have entered " + numold);
        System.out.println("Enter the new contact name");
        String newName = scan.nextLine();
       // System.out.println("you have entered " + newName);

        //scan.nextLine();
        System.out.println("Enter the new Phone number");
        int numnew = scan.nextInt();
        //System.out.println("you have entered " + numnew);
        scan.nextLine();

        Contacts c1 = Contacts.addContact(oldname, numold);

        Contacts c2 = Contacts.addContact(newName, numnew);
        mobilephone.modify(c1, c2);
//mobilephone.print();
    }

    private static void RemoveByName() {
        System.out.println("Enter the name you would like to remove...");
        String name=scan.nextLine();
        String out=mobilephone.removeContact(name)?"The contact removed":"Sorry such a name doesnot exists in contact";
        System.out.println(out);
    }

    private static void FindContactNumber() {
        System.out.println("Enter the number you wish to find in contact");
int contact=scan.nextInt();
scan.nextLine();
mobilephone.FindContact(contact);
    }

    private static void FindByName() {
        System.out.println("Enter the name you would like to search");
        String name=scan.nextLine();
        mobilephone.Find(name);
       // String out=mobilephone.Find(name)?"Found this contact":"Sorry couldnot find the contact";
    }

    private static void Addcontact() {

        System.out.println("Enter the new contact name");
        String name = scan.nextLine();
        //  scan.nextLine();
        // System.out.println(name);
        System.out.println("Enter the new Phone number");
        int number = scan.nextInt();
        Contacts con = Contacts.addContact(name, number);
        mobilephone.addContact(con);
        // mobilephone.print();

    }
}
