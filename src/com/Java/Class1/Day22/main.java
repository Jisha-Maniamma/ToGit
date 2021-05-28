package com.Java.Class1.Day22;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/05/24 7:56
 */
public class main {
    public static String To_Load_FILE="src/com/Java/Class1/Day22/Holidays_Entry_SheetV2.txt";

    public static void main(String[] args) throws IOException {
        LoadFrom(To_Load_FILE);

    }


    public static void LoadFrom(String to_Load_FILE) throws IOException {


        // table.getItems().clear();
        DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Path path= Paths.get(to_Load_FILE);
        BufferedReader br= Files.newBufferedReader(path);
        String input;

        try{
            System.out.println("loading from file- "+to_Load_FILE);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }




    }

}
