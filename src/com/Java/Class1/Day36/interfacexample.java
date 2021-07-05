package com.Java.Class1.Day36;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/07/06 7:18
 */
public class interfacexample implements  interviewer{
    public static void main(String[] args) {
        interviewer i=new Manager();
        i.submitIntrviewStatu();


        Manager ii=new Manager();
        ii.submitIntrviewStatu();
    }
}
class Manager implements interviewer{
    public Object submitIntrviewStatu(){
        System.out.println("Manager:Accept");
        return null;
    }
}
interface interviewer{

    default Object submitIntrviewStatu(){
        System.out.println("interviewer:Accept");
        return null;
    }
}
