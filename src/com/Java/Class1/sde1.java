package com.Java.Class1;

public class sde1 {
    public static int[] Totalcount=new int[26];
    public static void main(String[] args) {
        System.out.println("......................");
        //System.out.println("hai".length());
        getNumbers("abcd",1);
        for(int i: Totalcount)
            System.out.print(i+" ");
    }


    static public void getNumbers(String s,int num){
        //s='abcd' num=4
        int[] count= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        if(num==1){
            count[0]=s.length();

        }
        else {
            for (int i = 0; i < s.length() & i < num; i++) {




            }


        }
        Totalcount=count;

    }
}
