package com.Java.Class1.Day38;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/07/07 11:13
 */
public class threadExample extends Thread{ //implmnts Runnble


    @Override
    public void run() {

            System.out.println("running in a thread");

    }

    public static void main(String[] args) {
        threadExample t=new threadExample();
        t.start();
        System.out.println("running outside thread");
    }
}
