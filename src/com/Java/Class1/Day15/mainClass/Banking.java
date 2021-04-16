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

    public Banking(String FName, String LName, double balance) {
        this.FName = FName;
        this.LName = LName;
        this.Balance = balance;
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
}
