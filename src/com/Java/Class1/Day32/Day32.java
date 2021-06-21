package com.Java.Class1.Day32;

import java.io.IOException;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/06/22 7:30
 */
public class Day32 {
    public static void main(String[] args) throws MyExcepation{
        try{
            validate();
            p();
        }catch (MyExcepation e){
            System.out.println(e.toString());
        }
    }

    public static void validate(){

        throw new MyExcepation("haiiii");


    }
    static void p(){
        try{
            n();
        }catch (Exception e){
            System.out.println("exception");
        }
    }

    static void n() throws IOException {
        m();
    }
    public static void m() throws IOException {
        throw new java.io.IOException("eorrorrrr");
    }
}
class MyExcepation extends RuntimeException{
    String message;
    MyExcepation(String s){
        message=s;
    }

    //public String toString() {
    //        String s = getClass().getName();
    //        String message = getLocalizedMessage();
    //        return (message != null) ? (s + ": " + message) : s;
    //    }
    @Override
    public String toString(){
        return "Error is "+message;
    }
}
