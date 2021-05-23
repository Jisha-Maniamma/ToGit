package com.Java.Class1.Day21;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/05/21 8:01
 */
public class main {

    public static void main(String[] args) {
Outer o=new Outer();
Outer.inner i=o.new inner();

Outer.inner1 i1=new Outer.inner1();
        System.out.println(i.y+o.x);
        System.out.println(i1.z);
    }
}
class Outer{
    int x=12;
    class inner{
        int y=20;
    }
    static class inner1{
        int z=30;
    }
}
