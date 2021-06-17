package com.Java.Class1.Day30.a2;

import javafx.collections.FXCollections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/06/10 7:39
 */
public class main {
    public static String fileName;
    public static void main(String[] args) throws SQLException {
        Connection conn= DriverManager.getConnection("Jdbc:sqlite:aa.db");
        List<Holidays>h= FXCollections.observableArrayList();
        Holidays h1=new Holidays(LocalDate.of(2021,10,2));
        h.add(h1);
        h.add(new Holidays(LocalDate.of(2021,1,2)));
        h.add(new Holidays(LocalDate.of(2001,1,2)));
        h.add(new Holidays(LocalDate.of(2031,1,2)));
        System.out.println(h.contains(new Holidays(LocalDate.of(2021,10,2))));

        System.out.println("..........................................................................");
        System.out.println("..........................................................................");


         fileName="abckjlkfdjlmldfmbvb.txt";
        System.out.println(fileName);
        System.out.println(fileName="abckjlkfdjlmldfmbvb.txt".substring(2,4));
        System.out.println(fileName.toString());
    }

    @Override
    public String toString() {
        return "main{}";
    }
}
class Holidaydates{

}
