package com.Java.Class1.Day15.mainClass;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/04/16 10:59
 */
public class Banking {

    private String FName;
    private String LName;
    private double Balance;
    private int AccountType;
    public static final int Chcecking=1;
    public static final int Savings=1;
    public Banking(String FName, String LName, double balance,int AccountType) {
        this.FName = FName;
        this.LName = LName;
        this.Balance = balance;
        this.AccountType=AccountType;
    }

    public double deposit(double amountDeposit){
        return this.Balance+=amountDeposit;
    }
    public double withdraw(double withDraw){
        return this.Balance-=withDraw;
    }

    public double getBalance(){
        return this.Balance;
    }

    public String getFName() {
        return FName;
    }

    public String getLName() {
        return LName;
    }
    public boolean isChecking(){
        return  AccountType==Chcecking;
    }
}
