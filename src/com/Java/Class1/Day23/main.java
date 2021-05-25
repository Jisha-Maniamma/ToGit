package com.Java.Class1.Day23;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/05/25 8:16
 */
//public class main extends shape {
//
//    public static void main(String[] args) {
//        shape s=new main();
//        System.out.println(s.b=200);
//        s.calculArea();
//
//    }
//
//    @Override
//    public void calculArea() {
//        System.out.println(" area is "+(s.b*s.b));
//
//    }
//}
//
//
//abstract class shape{
//    int b=20;
//
//    abstract public void calculArea();
//
//}


abstract class Shape {
    int b = 20;
    abstract public void calculateArea();
}

public class main extends Shape {
    public static void main(String args[]) {
        main obj = new main();
        obj.b = 200;
        obj.calculateArea();
    }
    public void calculateArea() {
       // System.out.println("Area is " + (obj.b * obj.b));
    }
}
