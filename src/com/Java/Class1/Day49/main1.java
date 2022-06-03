package com.Java.Class1.Day49;

import java.io.FileWriter;

public class main1 {
    public static void main(String[] args) {
        System.out.println("...writing to excel file...");
        try{
            FileWriter f=new FileWriter("C:\\Users\\J0119\\Downloads\\test.csv");
            StringBuilder b=new StringBuilder();
            b.append("name");
            b.append(",");
            b.append("age");
            b.append("\n");

            b.append("jisha");
            b.append(",");
            b.append("12");
            b.append("\n");
            b.append("jj");
            b.append(",");
            b.append("20");
            b.append("\n");
f.write(b.toString());
f.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
