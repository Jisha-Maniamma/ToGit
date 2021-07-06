package com.Java.Class1.Day38;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/07/07 7:26
 */
public class main {
    public static void main(String[] args) {
        main m=new main();
        m.printArrValues(args);
    }

    private void printArrValues(String[] args) {

        try{
            System.out.println(args[0]+":"+args[1]);
        }catch (NullPointerException e){
            System.out.println("NullpointExcepation");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArayIndxOutOfBoundException e");
        }catch(IndexOutOfBoundsException e){
            System.out.println("IndexoutOfBoundException");
        }
    }
}
