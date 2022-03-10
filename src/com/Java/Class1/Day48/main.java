package com.Java.Class1.Day48;

public class main {
    public static void main(String[] args) {
        System.out.println("haiii");
        stack mystack=new stack(5);
        mystack.pop();
        mystack.push(10);
        mystack.push(3);
        mystack.push(60);
        mystack.push(0);
        mystack.push(100);
        mystack.push(110);
        mystack.push(20);

        mystack.printSatck();
        mystack.pop();
        mystack.printlessThan(30);
    }
}
