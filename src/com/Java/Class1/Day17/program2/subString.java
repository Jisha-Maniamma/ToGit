package com.Java.Class1.Day17.program2;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/04/26 13:54
 */
public class subString {
    public static final String nameMain="ascascasdasdascascasdasdascascasdasd";
    public static void main(String[] args) {
        int a="ascascasdasd".length();
        String Croppedname= nameMain.substring(a);
        System.out.println(Croppedname);

        String name="Jisha";
        System.out.println(name.substring(2));
        System.out.println(name.substring(1,4));
        System.out.println("********************************");
        String name1=new String("Jisha");
        String name2=new String("Jisha");



        System.out.println(name1==name2);

        System.out.println(name1.equals(name2));
        System.out.println("********************************");
        String name3=getname();
        String name4=getname();
        System.out.println(name3==name4);
        System.out.println(name3.equals(name4));
        System.out.println("********************************");

        StringBuffer sb=new StringBuffer("a");
        StringBuffer sb1=new StringBuffer("a");

        System.out.println(sb==sb1);
        System.out.println(sb.equals(sb1));
    }

    public static String getname(){
       // return new String("jisha");
        return "jisha";
    }
}
class getname{
    String name;

}
