package com.Java.Class1.Day19;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/05/19 7:17
 */
public class Main {
    public static void main(String[] args) {
        String name="JiSha";
        String name1="jisha";
        System.out.println(name.equalsIgnoreCase(name1));
        Telephone JishaLandlinePhone=new DeskPhone();
        JishaLandlinePhone.dail(1234);
        System.out.println("..........................");

        Telephone JishaMobilePhone=new mobilePhone(1234);
        JishaMobilePhone.powerOn();
        JishaMobilePhone.isRinging();


    }



}
