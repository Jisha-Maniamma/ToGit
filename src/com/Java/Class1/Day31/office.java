package com.Java.Class1.Day31;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/06/16 7:36
 */
public class office {
    public static void main(String[] args) {

        interview Ron=new HR();
        HR Ram=new HR();
        Employee Raj=new HR();


     //   Ron.specialization=new String[] {"Recruitment"};
        Ram.specialization=new String[] {"Recruitment"};
     //   Raj.specialization=new String[] {"Recruitment"};

      //  Ron.name="Ron Rahul";
        Ram.name="Ron Rahul";
        Raj.name="Ron Rahul";


        interview[] interviewers =new interview[]{new HR(),new Manager()};
        for(interview a:interviewers){
           a.conductInterview();
        }

        for(String a: Ram.specialization){
            System.out.println(a.toString());
        }

    }
}
class Manager extends Employee implements interview{
    String[] specialization;
    @Override
    public void conductInterview() {
        System.out.println("Manager is conducting interview");
    }
}

class HR extends Employee implements interview{

    String[] specialization;
    public void conductInterview() {
        System.out.println("HR is conducting interview");
    }
}
interface interview{

    public void conductInterview();
}

class Employee{
    String name;
    String address;
    String phoneNumber;
    float experience;

}