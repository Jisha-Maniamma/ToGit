package com.Java.Class1.Day18;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/05/17 8:32
 */
public class main {
    public static void main(String[] args) {
//        ArrayList<String> MyFriendsList=new ArrayList<String>();
//        MyFriendsList.add("Jisha");
//        MyFriendsList.add("Manish");
//        MyFriendsList.add("Krishna");
//        MyFriendsList.add("Gopi");
//        MyFriendsList.add("Mani");
//        MyFriendsList.add("Arun");
//
//        //displaying elements
//        System.out.println(MyFriendsList);
//
//        //Adding "Steve" at the fourth position
//        MyFriendsList.add(3, "Shiva");
//
//        //displaying elements
//        System.out.println(MyFriendsList);
        Bank bank1=new Bank("State Bank of India");
        bank1.AddBranch("AnuVijay T/S");
        bank1.addCustomer("AnuVijay T/S","Jisha",1200);

        bank1.addCustomer("AnuVijay T/S","Manish",10000);

        bank1.addCustomer("AnuVijay T/S","Gopi",8100);
        bank1.addCustomer("AnuVijay T/S","Mani",3200);

        bank1.AddBranch("Adinadu");
        bank1.addCustomer("Adinadu","Arun",1200);

        bank1.addCustomerTransaction("Adinadu","Arun",200);
        bank1.addCustomerTransaction("Adinadu","Arun",100);
        bank1.addCustomerTransaction("Adinadu","Arun",50);

        bank1.addCustomerTransaction("AnuVijay T/S","Jisha",200);
        bank1.addCustomerTransaction("AnuVijay T/S","Jisha",1000);
        System.out.println( bank1.getBankBranch().get(0).getBranchName());

        System.out.println( bank1.getBankBranch().get(1).getBranchName());

        System.out.println();
        System.out.println("..................................");
        System.out.println("..................................");
        bank1.listCustomers(bank1.getBankBranch().get(0).getBranchName(),true);
        System.out.println("..................................");
        System.out.println("..................................");


    }
}
