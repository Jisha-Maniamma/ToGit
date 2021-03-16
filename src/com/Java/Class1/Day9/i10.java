package com.Java.Class1.Day9;

public class i10 extends Car{
    private int roadService;

    public i10( String size,  int gear, boolean isManual,int roadService) {
        super("i10 sportz", size, 4, 4, gear, isManual);
        this.roadService=roadService;
    }

    public void accelerate(int rate){
        int newVelocity=getCurrentvelocity()+rate;
        if(newVelocity==0){
            stop();
        }
       else if(newVelocity>=10 && newVelocity<=20){
            changeGear(2);
        }
       else if(newVelocity>20){
           changeVelocity(newVelocity,getCurrentDirection());
        }
    }
}
