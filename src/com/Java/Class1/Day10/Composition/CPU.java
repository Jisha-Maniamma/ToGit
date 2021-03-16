package com.Java.Class1.Day10.Composition;

public class CPU {
    private PowerButton thePC;

    private int YearOld;
    private int ramGB;

    public CPU(PowerButton thePC, int yearOld, int ramGB) {
        this.thePC = thePC;
        YearOld = yearOld;
        this.ramGB = ramGB;
    }

//    public PowerButton getThePC() {
//        return thePC;
//    }

    public int getYearOld() {
        return YearOld;
    }

    public int getRamGB() {
        return ramGB;
    }

    public void ON(){
        thePC.pressOn();
    }
}
