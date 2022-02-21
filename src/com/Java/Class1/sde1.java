package com.Java.Class1;

public class sde1 {
    public static StringBuilder out=new StringBuilder();
    public static int[] Totalcount=new int[26];
    public static void main(String[] args) {
        System.out.println("......................");

        getNumbers("abcd",0);
        ;
        Long l=2777777777777777L;


        for(int i: Totalcount)
            System.out.print(i+" ");


            System.out.println(out);

        System.out.println("abcd".substring(0,0));
    }


    static public void getNumbers(String s,int num){
        String[] ss=new String[200];
        //s='abcd' num=4
        int[] count= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        for (int i = 0; i < s.length() ; i++) {
            out.append(s.charAt(i)+",");
            System.out.println(i);
            System.out.println(s.substring(0,i)+","+s.substring(i));


            getNumbers(s.substring(0,i)+s.substring(i+1),i);
        }


count[0]=s.length();
        Totalcount=count;

    }
}
