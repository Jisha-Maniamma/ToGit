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
        }
    }
    public String pop(){
        if(isEmpty()){
            return "this sack is empty";
        }
        return "the element is "+arrayStack[position];
    }




}
