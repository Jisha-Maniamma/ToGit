package com.Java.Class1.Day42.listChallenge;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer=new Customer("jp",12);
        Customer anotherCustomer=customer;
        anotherCustomer.setBalance(11);
        System.out.println("balance for customer "+customer.getName()+" "+customer.getBalance());

        ArrayList<Integer> i=new ArrayList<>();
        i.add(1);
        i.add(1);
        i.add(1);
        i.add(1);

        i.add(1,1);
        System.out.println(i.size());

    }
}
