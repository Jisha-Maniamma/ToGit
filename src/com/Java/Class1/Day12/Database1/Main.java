package com.Java.Class1.Day12.Database1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/03/22 15:03
 */
public class Main {
    public static void main(String[] args) {

//creating  database
        try{
            Connection conn= DriverManager.getConnection("jdbc:sqlite:sample.db");

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }


    }
}
