package com.Java.Class1.Day31.InterfaceStudy_example;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/06/16 8:20
 */
public class office implements  interview{
    public static void main(String[] args) {
        office o=new office();
        o.conductInterview();
        o.sayByeBye();
        o.sayHello();
        // o.Iam();
        o.IAgree();
        System.out.println(".....................");
        interview.Iam();
        System.out.println(interview.age);;


        System.out.println(".....................");
        interview o1=new office();
        o1.conductInterview();
        o1.sayByeBye();
        o1.sayHello();
//        o1.IAgree();
//        o1.Iam();
        interview.Iam();    }
    public void IAgree(){
        System.out.println("yes i agree");
    }
    @Override
    public void conductInterview() {
        System.out.println("yes i conduct interview");
    }

    @Override
    public void sayByeBye() {
        System.out.println("yes Bye bye all");
    }
//    public void Iam(){
//        System.out.println("yes Hai i am ....");
//    }
//    public void sayHello(){
//        System.out.println("yes Hello all...");
//    }
}

interface interview{
    int age=30;
    public void conductInterview();
    default void sayHello(){
        System.out.println("Hello all");
    }
    abstract void sayByeBye();

    static void Iam(){
        System.out.println("I am interviewer");
    }
}

