package com.Java.Class1.Day25;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/05/31 7:30
 */
public class exceptionxample {
    static void getValue() throws Exp1 {
        throw new Exp1("");
    }

    public static void main(String[] args) throws  Exp1 {



      //  prrrrint();
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

    private static void prrrrint()  {
        int a=1;
      //  if(a==1) throw new Exp1("");
        if(a>0) throw new IllegalAccessError("error");


    }
}
class printAAAA{
    void getPrinterName(int n) throws Exp1{
        if(n<3)
            throw new Exp1("");

    }
}
class Exp1 extends Exception{
    public Exp1(String s) {
        super();
    }
}