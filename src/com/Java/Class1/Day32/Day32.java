package com.Java.Class1.Day32;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/06/22 7:30
 */
public class Day32 {
    public static void main(String[] args) throws MyExcepation{
        try{
            throw new MyExcepation("haiiii");

        }catch (MyExcepation e){
            System.out.println(e);
        }
    }

}
class MyExcepation extends RuntimeException{
    String message;
    MyExcepation(String s){
        message=s;
    }
//    public String tostring(){
//        return "Error is "+message;
//    }
}
