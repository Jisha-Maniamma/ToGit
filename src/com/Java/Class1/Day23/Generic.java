package com.Java.Class1.Day23;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/05/25 9:05
 */
public class Generic extends Aclass implements MyInterface {

    public static void main(String[] args) {
        List<Integer> a= new ArrayList<>();
        a.add(1);
        a.add(2);

        print(a);
        System.out.println("...................");
new Generic().print();
        System.out.println(MyInterface.ab);
    }
    public void print(){
        System.out.println(this.a);
        System.out.println(super.a=20);
    }

    private static void print(List<Integer> a) {

        for(Object aa:a){
            System.out.println(aa);
        }
    }
}
class Aclass{
    int a;
}
interface MyInterface{
    int ab=100;
}