package com.Java.Class1.Day18;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/05/17 14:48
 */
public class Bank {

    private List<Branch> BankBranch;
    private String name;

    public List<Branch> getBankBranch() {
        return BankBranch;
    }

    public Bank(String BankName){
        this.name=BankName;
        this.BankBranch=new ArrayList<Branch>();
    }
    public boolean AddBranch(String BranchName){
        if(FindBranch(BranchName)==null){
            this.BankBranch.add(new Branch(BranchName));
            return true;

        }
        return false;
    }

    //adding a customer to a bank
    public boolean addCustomer(String BranchName,String customerName,double initialAmount){
        Branch GivenBranch=FindBranch(BranchName);

      //  System.out.println(GivenBranch.getCustomrList().get(0));
        if(GivenBranch!=null){
           // System.out.println("Branch exists so i can add customers");
            GivenBranch.AddNewCustomer(customerName,initialAmount);
            //System.out.println(GivenBranch.getCustomrList().get(0));
            return true;

        }
        //System.out.println("Branch dsnt exists so i cannot add customers");
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double money){
        Branch GivenBranch=FindBranch(branchName);
        if(GivenBranch!=null){
            return GivenBranch.AddTranaction(customerName,money);
        }
        return false;
    }

    private Branch FindBranch(String branchName) {
     //   System.out.println(BankBranch.size());
        for(int i=0; i<this.BankBranch.size(); i++) {

            Branch checkedBranch = this.BankBranch.get(i);
            if(checkedBranch.getBranchName().equals(branchName)) {
                //System.out.println("this branch exists");
                return checkedBranch;
            }
        }

        return null;
    }

//    private Branch FindBranch(String branchName) {
//        for(int i=0;i<BankBranch.size();i++){
//            Branch branch=BankBranch.get(i);
//            if(branch.getBranchName().equals(branchName)){
//                return  branch;
//            }
//        }
//        return null;
//    }

    public boolean listCustomers(String branchname, boolean Showtransactions){
        Branch GivenBrnch=FindBranch(branchname);
        if(GivenBrnch!=null){
            System.out.println("Customers of branch...  "+GivenBrnch.getBranchName());

            List<Customer> customersOfbranch=GivenBrnch.getCustomrList();
int i=0;           // System.out.println(customersOfbranch.get(0));
            for(Customer a:customersOfbranch){
                System.out.println(".....................Customer "+(i++)+" is..........................");
                System.out.println("customer:"+a.getCustomerName());
                if(Showtransactions){
                    System.out.println("Transacation detils are ");
                    List<Double> transations=a.getTransactions();
                    for(Double b:transations){
                        System.out.println("Amount: "+b);
                    }
                }


            }
            return true;
        }
        return false;
    }

}
