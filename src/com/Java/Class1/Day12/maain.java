package com.Java.Class1.Day12;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/03/30 14:01
 */
public class maain {
    public static void main(String[] args) {
        Project.setCONNECTION("a","b","c");
        System.out.println(Project.getCONNECTION());;
        System.out.println(Project.gettext());
    }
}
class Project{
    private static String CONNECTION;

    public static void setCONNECTION(String fname,String secondName,String department) {
        Project.CONNECTION = "jdbc:sqlite:"+fname+"_"+secondName+"_"+department+".db";
    }

    public static String getCONNECTION() {
        return CONNECTION;
    }

    public static String gettext() {
        return CONNECTION+"...hai";
    }
}
