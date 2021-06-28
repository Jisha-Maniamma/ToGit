package com.Java.Class1.Day19;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/05/19 7:34
 */
public class mobilePhone implements Telephone{
    private boolean isOn;
    private int myNumber;
    public mobilePhone(int myNumber){
        this.myNumber=myNumber;
    }
    public void sayHai(){
        System.out.println("Hai...from mobile Phone");
    }
    @Override
    public void powerOn() {
        isOn=true;
        System.out.println("switching on power button");
    }
    @Override
    public void dail(int phoneNumber) {
        if(isOn){
            System.out.println("now dialing  "+phoneNumber);
        }


    }
    @Override
    public boolean isRinging() {
        if(isOn){
            System.out.println("is ringing");
            return true;
        }
        return  false;

    }
}
