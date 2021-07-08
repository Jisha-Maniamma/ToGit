package com.Java.Class1.Day39;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/07/08 15:21
 */


class ThreadSample1 implements Runnable {
    Thread t;

    public void run() {
        System.out.println("p");
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread i = " + i);
        }
    }

    public void start () {
        System.out.println("Starting "  );
        if (t == null) {
            t = new Thread (this, "a");
            t.start ();
        }
    }
}

public class main {

    public static void main(String[] args)  {
        ThreadSample1 threadSample = new ThreadSample1();
        threadSample.start();
        System.out.println("...........");
        Thread t=new Thread(new ThreadSample1());
        t.start();

    }
}
