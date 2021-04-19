package com.Java.Class1.Day15;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/04/16 10:59
 */
public class main {
    public static void main(String[] args) {
        System.out.println("Its working");
        setvalueRandom.calulatePercentage(1200,6);
        System.out.println(setvalueRandom.Totalmarks);
        System.out.println(setvalueRandom.getTotalmarks());


        System.out.println(getvalueRandom.getTotalmarks());
        System.out.println(getvalueRandom.getTotalmarks1());
    }

}
class setvalueRandom{
   public static  int Totalmarks;
    public static  int numberofSubjects;

    public static void calulatePercentage(int TotalMarks,int numberOfSubjects) {
        Totalmarks=TotalMarks/numberOfSubjects;
        System.out.println("...."+Totalmarks);
        numberofSubjects=numberOfSubjects;
    }

    public static int getTotalmarks() {
        return Totalmarks;
    }
}
class getvalueRandom{

    public static int getTotalmarks() {
        return setvalueRandom.Totalmarks;
    }

    public static int getTotalmarks1() {
        return setvalueRandom.getTotalmarks();
    }

}