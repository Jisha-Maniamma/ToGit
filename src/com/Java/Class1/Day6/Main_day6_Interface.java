package com.Java.Class1.Day6;

public class Main_day6_Interface {
    public static void main(String[] args) {

        Telephone JishaTelephone=new mobilePhone(12);
        JishaTelephone.makeCall(134);

        Telephone ArunTelephone=new LandLine(134);
        ArunTelephone.makeCall(12);
    }
}
interface Telephone{
    void makeCall(int phone);
    void isRinging();

}
class mobilePhone implements Telephone{
    private int myNum;
    private boolean isOn=false;
    public mobilePhone(int myNum) {
        this.myNum = myNum;
    }


    @Override
    public void makeCall(int ToCallphone){
        isOn=true;
        if(myNum!=ToCallphone)
        System.out.println("Mobile phone can make call "+myNum+" is calling "+ToCallphone);
        else
            System.out.println("Check number please");
            return;
    }
    @Override
    public void isRinging(){

        System.out.println("Mobile Phone is ringing");
        String message=isOn?"Pick up the call":"Unlock and attend call";
        System.out.println(message);
    }
}

class LandLine implements Telephone{
    public LandLine(int myNum) {
        this.myNum = myNum;
    }

    private int myNum;
    @Override
    public void makeCall(int ToCallphone){
        if(myNum!=ToCallphone)
            System.out.println("LandLine phone can make call "+myNum+" is calling "+ToCallphone);
        else
            System.out.println("Check number please");
        return;
    }
    @Override
    public void isRinging(){
        System.out.println("LandLine Phone is ringing");
    }
        }

