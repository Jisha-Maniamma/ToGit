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


        ///access outer class fom inner class

        System.out.println(i.myInnermethod());
////////////////////////////////////////////////////////////////
        System.out.println("..............................");

        A_Outer outer1=new A_Outer();
        A_Outer.A_inner1 inner1=outer1.new A_inner1();
        System.out.println(inner1.getXvalue());

    }
}
class Outer{
    int x=12;
    class inner{
        public int myInnermethod(){
            return x;
        }

        int y=20;
    }
    static class inner1{
        int z=30;

    }
}

class A_Outer{
    int x=10;
    class A_inner1{
    public int getXvalue(){
        return x;
    }

        int y=20;
    }

    static class A_inner2{
        int z=5;

    }
}
