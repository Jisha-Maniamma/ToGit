package com.Java.Class1.Day10.Composition;

public class PowerButton {

    public String LogoName;

    public PowerButton(String logoName) {
        LogoName = logoName;
    }

    public String getLogoName() {
        return LogoName;
    }

    public void setLogoName(String logoName) {
        LogoName = logoName;
    }

    public void pressOn(){
        System.out.println("Pressed the power button to switch it on");
    }
}
