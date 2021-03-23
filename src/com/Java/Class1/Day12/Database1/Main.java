package com.Java.Class1.Day12.Database1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
            Statement statement=conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS company( _id INTEGER, name TEXT,departmentName TEXT)");
statement.execute("INSERT into company(_id,name,departmentName) values(1,'Juntos Consulting','IT')");
            statement.close();
            conn.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }


    }
}
