package com.Java.Class1.Day12.Database1;

import java.sql.*;

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

           // conn.setAutoCommit(false);
            Statement statement=conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS company( _id INTEGER, name TEXT,departmentName TEXT)");
            statement.execute("INSERT into company(_id,name,departmentName) values(7,'Juntos Consulting','Customer Care')");
            statement.execute("INSERT into company(_id,name,departmentName) values(6,'Juntos Engineering','civil')");
           // statement.execute("update company SET _id=5 where name='Juntos Engineering'");
           // statement.execute("delete from company where name='Juntos Engineering'");

           statement.execute("select DISTINCT name  from company");
            ResultSet result=statement.getResultSet();
            while (result.next()){
                System.out.println("name : "+result.getString("name"));
            }
            statement.close();
            conn.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }


    }
}
