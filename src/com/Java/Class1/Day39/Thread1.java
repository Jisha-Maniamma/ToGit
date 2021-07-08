package com.Java.Class1.Day39;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/07/08 15:22
 */
public class Thread1 extends Thread implements Runnable{

    public void run(){
        for(int i=0;i<100;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
       new Thread1().start();
       Thread t=new Thread(new Thread1());
       t.start();
        Thread t1=new Thread(new Thread1());
        t1.start();

    }
}
