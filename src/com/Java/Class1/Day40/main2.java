package com.Java.Class1.Day40;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/07/26 7:56
 */
public class main2 {
    public static void main(String[] args) {
       StringBuilder a=new StringBuilder("java");
       String s="ll";
       a.append(s);
       a.substring(4);
        System.out.println(a.indexOf("ava")+"...");
        int b=a.indexOf(s);
        System.out.println(b);
        System.out.println("//////////////////");
        List<String> list=new ArrayList<>();
        list.add("pencil");
        list.add("pen");
        list.add("book");
        for(String h:list){
            if(h.indexOf("p")==0) continue;
            else System.out.println(h+" ");
        }
    }
}
