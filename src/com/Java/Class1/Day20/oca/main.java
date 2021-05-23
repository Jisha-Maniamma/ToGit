package com.Java.Class1.Day20.oca;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/05/20 8:01
 */
public class main {
    public static void mian(String... cmd){
        main("pivate",cmd);

    }

    public static void main(String type, String[] args){
        System.out.println(args[0]+args[1]);
    }

    public static void main(String[] args) {
        String s="Java";
        s.concat(
                " SE 6"        );
        s.replace('6','7');
        System.out.println(s);
    }
}
