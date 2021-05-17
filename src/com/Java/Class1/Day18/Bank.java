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
    public boolean addCustomer(String customerName,String BranchName,double initialAmount){
        Branch GivenBranch=FindBranch(BranchName);
        if(GivenBranch!=null){
            return GivenBranch.AddNewCustomer(customerName,initialAmount);

        }
        return false;
    }

    public boolean AddCustomerTransaction(String branchName,String customerName,double money){
        Branch GivenBranch=FindBranch(branchName);
        if(GivenBranch!=null){
            return GivenBranch.AddTranaction(customerName,money);
        }
        return false;
    }
    private Branch FindBranch(String branchName) {
        for(int i=0;i<BankBranch.size();i++){
            Branch branch=BankBranch.get(i);
            if(branch.getBranchName().equals(branchName)){
                return  branch;
            }
        }
        return null;
    }

    public boolean listCutomers(String branchname,boolean Showtransactions){
        Branch GivenBrnch=FindBranch(branchname);
        if(GivenBrnch!=null){
            System.out.println("Customers of branch...  "+GivenBrnch.getBranchName());
            List<Customers> customersOfbranch=GivenBrnch.getCustomrList();
            for(Customers a:customersOfbranch){
                System.out.println("customer:"+a.getCustomerName());
                if(Showtransactions){
                    System.out.println("Transacation detils are ");
                    List<Double> transations=a.getTransactions();
                    for(Double b:transations){
                        System.out.println(b);
                    }
                }


            }
            return true;
        }
        return false;
    }

}
