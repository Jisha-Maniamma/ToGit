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




}
