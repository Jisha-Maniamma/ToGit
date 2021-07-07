package com.Java.Class1.Day38;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/07/07 13:11
 */
public class threadExample3 {

    public static void main(String[] args) {
        System.out.println("hello from main thread");
        Thread a=new anotherThread();
        a.start();
        System.out.println("hello again from main tread");

    }
}
class anotherThread extends Thread{
    @Override
    public void run() {

        System.out.println(ThreadColor.Green+"hello fom my another 1 thread");
    }
}
class ThreadColor{
    public static final String Green="\u001B[32m";


        }
