package com.Java.Class1.Day9;

public class Vehicle {
    private String name;
    private String size;

    private int currentvelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentDirection=0;
        this.currentvelocity=0;
    }

    public void Steer(int direction){
        this.currentDirection+=direction;
        System.out.println("currently streeting at "+currentDirection+" at speed "+currentvelocity);

    }
    public void move(int velocity,int direction){
        currentDirection=direction;
        currentvelocity=velocity;
        System.out.println("Vehicle is moving at velocity "+velocity+" in the direction "+direction);

    }

    public void stop(){
        this.currentvelocity=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCurrentvelocity() {
        return currentvelocity;
    }

    public void setCurrentvelocity(int currentvelocity) {
        this.currentvelocity = currentvelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
}
