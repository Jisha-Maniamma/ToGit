package com.Java.Class1.Day18;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/05/17 14:38
 */
public class Branch {

    private String BranchName;
    private List<Customer> CustomrList;

    public Branch(String name){
        this.BranchName=name;
        CustomrList=new ArrayList<>();
    }

    public String getBranchName() {
        return BranchName;
    }

    public List<Customer> getCustomrList() {
        return CustomrList;
    }

    public boolean AddNewCustomer(String Customername, double InitialTransaction){
        if(FindCustomer(Customername)==null){
            CustomrList.add(new Customer(Customername,InitialTransaction));
            return true;
        }
        return false;
    }

    private Customer FindCustomer(String customername) {

        for(int i=0;i<CustomrList.size();i++){
            Customer customer=CustomrList.get(i);
            if(customer.getCustomerName().equals(customername)){
                return customer;
            }

           } return null;

    }

    public boolean AddTranaction(String customerName,double money){
        Customer ExistingCustomer=FindCustomer(customerName);
        if(ExistingCustomer!=null){
            ExistingCustomer.addTransaction(money);
            return true;
        }
        return false;
    }

}
