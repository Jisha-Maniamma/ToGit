package com.Java.Class1.Day48;

public class stack {
    private int lengthOfStack;
    private int[] arrayStack;
    private int position;


    public stack(int length){
        this.lengthOfStack=length;
        arrayStack=new int[length];
        position=-1;
    }

    public boolean isFull(){
        return this.lengthOfStack-1==position;
    }
    public boolean isEmpty(){
        return position==-1;
    }
    public void push(int value){
        if(!isFull()){
            position++;
            arrayStack[position]=value;
        }else{
            System.out.println("the stack is full");
        }
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("this sack is empty");
            return ;
        }
        System.out.println("the element is "+arrayStack[position]);
    }

public void printSatck(){
        int a=position;
        while(a!=-1){
            System.out.println("\t\t"+arrayStack[a]);
            a--;
        }
}


    public void printlessThan(int i) {
        int a=position;
        while(a!=-1){
           if(arrayStack[a]<i) System.out.println("\t\t"+arrayStack[a]+" at location "+a);
            a--;
        }
    }
}
