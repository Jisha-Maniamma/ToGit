package com.Java.Class1.Day31;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/06/17 8:38
 */
public class main {
    private static final DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSS");
    public static String ignore="IGNORE:                        ";
    public static final String message="hai";
    public static void main(String[] args) {
        System.out.println("WARNING: "+"  ["+ LocalDateTime.now().format(df)+" ===> "+message.toUpperCase()+"]");
        System.out.println("ERROR: "+"    ["+ LocalDateTime.now().format(df)+" ===> "+message+"]");
        System.out.println("INFO: "+"     ["+ LocalDateTime.now().format(df)+" ===> "+message+"]");
        System.out.println(ignore+"["+ LocalDateTime.now().format(df)+" ===> "+message+"]");
        ignore=ignore.trim();
        if(ignore.length()<11)
            for(int i=ignore.length();i<11;i++){
                ignore=ignore+" ";
        }

        System.out.println(ignore+"["+ LocalDateTime.now().format(df)+" ===> "+message+"]");
        //System.out.println(typeOfWarning+"  ["+ LocalDateTime.now().format(df)+" ===> "+message+"]");
    }
}
