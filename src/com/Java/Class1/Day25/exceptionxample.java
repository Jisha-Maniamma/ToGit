package com.Java.Class1.Day25;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/05/31 7:30
 */
public class exceptionxample {

    public static void main(String[] args) throws  Exp1 {
        printAAAA a=new printAAAA();

      //  a.getPrinterName(2);
       try{
           a.getPrinterName(2);
       }
       catch (Exp1 e){
           throw e;
         //  System.out.println("finish");
       } finally {
           System.out.println("hahahha");
       }


       //

    }
}
class printAAAA{
    void getPrinterName(int n) throws Exp1{
        if(n<3)
            throw new Exp1();

    }
}
class Exp1 extends Exception{
    public Exp1() {
        System.out.println("its exception");
    }
}