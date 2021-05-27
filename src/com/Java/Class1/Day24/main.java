package com.Java.Class1.Day24;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/05/27 7:55
 */
public class main {

    public static void main(String[] args) {
        Interviewer interviewer=new HR();
        interviewer.conductInterview();
        ((HR) interviewer).specialization=new String[] {"Staffing"};
        System.out.println("......................................................");
        Interviewer [] interview1=new Interviewer[2];
        interview1[0]=new HR();
        interview1[0]=new Manager();

for(Interviewer a: interview1){
    if(a instanceof Manager){
int teamSize= ((Manager) a).teamsize;
        System.out.println(teamSize);
    }
}


    }
}
class Employee{

}
class HR extends  Employee implements Interviewer{
    String[] specialization;

    public void conductInterview(){
        System.out.println("HR conducts interview");
    }
}

class Manager extends  Employee implements  Interviewer{
int teamsize;
    @Override
    public void conductInterview() {
        System.out.println("Manager conducts interview");
    }
}
interface Interviewer{

    public void conductInterview();
}