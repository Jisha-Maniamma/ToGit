package com.Java.Class1.Day19;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/05/19 7:27
 */
public class DeskPhone implements Telephone{
    private int myNumber;

    @Override
    public void powerOn() {
        System.out.println("no power button");
    }

    @Override
    public void dail(int phoneNumber) {
        System.out.println("now dialing  "+phoneNumber);

    }


    @Override
    public boolean isRinging() {
        System.out.println("is ringing");
return true;
    }
}
