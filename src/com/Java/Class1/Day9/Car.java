package com.Java.Class1.Day9;

public class Car extends Vehicle {
    private int wheels;
    private int numberOfDoors;
    private int gear;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int numberOfDoors, int gear, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.numberOfDoors = numberOfDoors;
        this.gear = gear;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("car.current gear changed to  "+this.currentGear);
    }

    public void changeVelocity(int velocity,int direction){
        System.out.println("car is moving at velocity "+velocity+" Direction "+direction);
        super.move(velocity,direction);

    }

//    @Override
//    public void stop(){
//
//    }
}
