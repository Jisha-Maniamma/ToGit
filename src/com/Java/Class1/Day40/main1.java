package com.Java.Class1.Day40;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/07/26 7:19
 */
public class main1 {
    public static void main(String[] args) {
        String[] a={"a","b","c","d"};
       try{
           outer:
           for(String b1:a){
               // System.out.println(b1+"....");
               for(String b:a){
                   //  System.out.println(b+"----");
                   if(b=="b")continue;
                   System.out.println(b);
               } }
       }catch (Exception e){
           System.out.println(e);
       }

    }
}
