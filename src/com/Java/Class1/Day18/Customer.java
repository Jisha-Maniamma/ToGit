package com.Java.Class1.Day18;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/05/17 14:37
 */
public class Customer {
private String CustomerName;
private List<Double> transactions;

public Customer(String name, double InitialTransaction){
    this.CustomerName=name;
    transactions=new ArrayList<Double>();
    addTransaction(InitialTransaction);


}

public void addTransaction(double Trnsaction){
    transactions.add(Trnsaction);
}

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public List<Double> getTransactions() {
        //System.out.print("Amount: ");
        return transactions;
    }

    public void setTransactions(List<Double> transactions) {
        this.transactions = transactions;
    }
}
