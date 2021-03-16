package com.Java.Class1.Day10.Composition;

public class main {
    public static void main(String[] args) {
PowerButton myPC=new PowerButton("Dell Race");
        CPU myCPU=new CPU(myPC,5,4);
myCPU.ON();

///or
        ///myCPU.getThePC().pressOn();

    }
}
