package com.Java.Class1.Day12.Database1.DB;

import com.Java.Class1.Day12.Database1.DB.Model.DataSource;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/03/25 14:52
 */
public class Main {

    public static void main(String[] args) {
        DataSource dataSource=new DataSource();
        if(!dataSource.open()){
            System.out.println("!error cannot open");
            return;
        }

        if(dataSource.createTable()){
            System.out.println("Tables successfully created");
        }
        dataSource.close();
    }
}
