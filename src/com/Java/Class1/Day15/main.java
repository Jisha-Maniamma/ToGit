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
    }

}
class setvalueRandom{
   public static  int Totalmarks;

    public static void calulatePercentage(int TotalMarks,int numberOfSubjects) {
        Totalmarks=TotalMarks/numberOfSubjects;
    }

    public static int getTotalmarks() {
        return Totalmarks;
    }
}
