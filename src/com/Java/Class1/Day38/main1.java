package com.Java.Class1.Day38;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/07/07 7:34
 */
public class main1 {
    public static void main(String[] args) {
        main1 m=new main1();
        m.method();
    }

    private void method() {
        try{
            guru();
            return;
        }finally {
            System.out.println("finally");
        }
    }

    private void guru() {
        System.out.println("in guru"); throw new StackOverflowError();
    }
}
