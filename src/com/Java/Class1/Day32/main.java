package com.Java.Class1.Day32;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/06/22 10:42
 */
public class main extends main2{
    public static void main(String[] args) {
        main m=new main();
        m.m1();m.m2();m.m3();m.m4();

        it1 mm=new main();
        mm.m1();
        //mm.m2();mm.m3();mm.m4();
    }

    @Override
    public void m4() {
        System.out.println("this is m4");
    }
}

interface it1{
    void m1();
}
interface it2 extends it1{
    void m2();
    void m4();
}
abstract class main1 implements it2{
    @Override
    public void m1() {
        System.out.println("this si m1");
    }

}
abstract class  main2 extends  main1{
    public void m2(){
        System.out.println("this is m2");
    }
    public void m3(){
        System.out.println("this is m3");
    }
}
