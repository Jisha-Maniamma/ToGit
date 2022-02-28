package com.Java.Class1.Tim_JavaExam.garden.vegitable;

import java.io.*;
import java.util.Scanner;

public class bufferedReaderunderstanding {
    public static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        File f=new File("C:/Users/J0119/Documents/Jisha_Maniamma/names1.txt");
        if (f.exists()){
            System.out.println("deleting...");
            f.delete();}
        BufferedReader reader=new BufferedReader(new FileReader("C:/Users/J0119/Documents/Jisha_Maniamma/names.txt"));
        String s;
        BufferedWriter writerr=new BufferedWriter(new FileWriter("C:/Users/J0119/Documents/Jisha_Maniamma/names1.txt",true));




       writerr.append(".................\n");

        while((s=reader.readLine())!=null){
            System.out.println(s);

            writerr.append(s+"\n");

            //reader.skip(2);
        }
        reader.close();
        writerr.close();



    }
}
