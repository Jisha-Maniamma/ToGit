package com.Java.Class1.Day12.Database2;

import java.sql.*;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/03/22 15:04
 */
public class Main {
    public static final String DB_NAME="sample2.db";
    public static final String CONNECTION_NAME="jdbc:sqlite:"+DB_NAME;

    public static final String TABLE_NAME="company";

    public static final String COLUMN_ID="_id";
    public static final String COLUMN_NAME="name";
    public static final String COLUMN_DEPARTMENT="departmentName";



    public static void main(String[] args)  {
        try{
            Connection conn= DriverManager.getConnection(CONNECTION_NAME);
            Statement statement=conn.createStatement();

            statement.execute("CREATE TABLE IF NOT EXISTS "+TABLE_NAME+" ("
                    +COLUMN_ID+" INTEGER PRIMARY KEY,"+COLUMN_NAME+" TEXT NOT NULL,"+COLUMN_DEPARTMENT+" TEXT NOT NULL) ");
//
//            statement.execute("CREATE TABLE IF NOT EXISTS "+TABLE_NAME+" ("
//                    +COLUMN_ID+" INTEGER PRIMARY KEY,"+COLUMN_NAME+" TEXT NOT NULL,"+COLUMN_DEPARTMENT+" TEXT NOT NULL) ");
//
//            statement.execute("INSERT into "+TABLE_NAME+" ("
//                    +COLUMN_ID+" ,"+COLUMN_NAME+" ,"+COLUMN_DEPARTMENT+" ) Values(7,'ghi LTD','Accounting')");
//
//            statement.execute("INSERT into "+TABLE_NAME+" ("
//                    +COLUMN_ID+" ,"+COLUMN_NAME+" ,"+COLUMN_DEPARTMENT+" ) Values(8,'HIS','Accounting')");
//            statement.execute("INSERT into "+TABLE_NAME+" ("
//                    +COLUMN_ID+" ,"+COLUMN_NAME+" ,"+COLUMN_DEPARTMENT+" ) Values(9,'NTT','Electronics')");
//            statement.execute("INSERT into "+TABLE_NAME+" ("
//                    +COLUMN_ID+" ,"+COLUMN_NAME+" ,"+COLUMN_DEPARTMENT+" ) Values(10,'Docomo Consulting','IT')");
//            statement.execute("INSERT into "+TABLE_NAME+" ("
//                    +COLUMN_ID+" ,"+COLUMN_NAME+" ,"+COLUMN_DEPARTMENT+" ) Values(11,'SoftBank Consulting','IT')");
//            InsertCompanyData(12,"aaa","CS",statement);
//            InsertCompanyData(13,"aaaaaaaaa","CS",statement);

            statement.execute("UPDATE "+TABLE_NAME+" SET "+COLUMN_NAME+"= 'JAIST' where "+COLUMN_ID+"= 11");

            ResultSet result=statement.executeQuery("SELECT DISTINCT "+COLUMN_DEPARTMENT+" FROM "+TABLE_NAME);

            System.out.println("The column names present in our database is- ");
            while(result.next()){
                System.out.println(result.getString(COLUMN_DEPARTMENT));
            }
            result.close();
            statement.close();
            conn.close();


            /*
            The column names present in our database is-
            IT
            Civil
            Mechanical
            Electronics
            Accounting
             */
        }catch (SQLException e){
            System.out.println("The error that exists is "+e.getMessage());
        }




//SELECT songs.track,songs.album,albums.name FROM songs
// JOIN albums ON songs.album=albums._id
// ORDER by albums.name,songs.track COLLATE NOCASE DESC;




//SELECT artists.name,albums.name,songs.track,songs.title FROM songs
//INNER JOIN albums on songs.album=albums._id
//INNER JOIN artists on albums.artist=artists._id
//ORDER BY artists.name;




//SELECT artists.name,albums.name,songs.track,songs.title FROM songs
//INNER JOIN albums on songs.album=albums._id
//INNER JOIN artists on albums.artist=artists._id
//where artists._id=19
//ORDER BY artists.name;



//SELECT artists.name,albums.name,songs.track,songs.title FROM songs
//INNER JOIN albums on songs.album=albums._id
//INNER JOIN artists on albums.artist=artists._id
//where artists.name like "%ELF"
//ORDER BY artists.name;



//CREATE VIEW Jisha_Table_new As
//SELECT artists.name,albums.name,songs.track,songs.title FROM songs
//INNER JOIN albums on songs.album=albums._id
//INNER JOIN artists on albums.artist=artists._id
//ORDER BY artists.name;


//drop view Jisha_Table_new;


//CREATE VIEW Jisha_Table_new As
//SELECT artists.name as ArtistsName,albums.name AlbumsName,songs.track,songs.title FROM songs
//INNER JOIN albums on songs.album=albums._id
//INNER JOIN artists on albums.artist=artists._id
//ORDER BY artists.name;


//SELECT count(songs._id) FROM songs;
    }
    private static void InsertCompanyData(int id, String Cname,String departmentname,Statement statement){
        try{


//            statement.execute("INSERT into "+TABLE_NAME+" ("+COLUMN_ID+" ,"+COLUMN_NAME+" ,"+COLUMN_DEPARTMENT+" ) Values("
//                                                                +121+" ,"+'a'+" ,"+'p'+")");
            statement.execute("INSERT into "+TABLE_NAME+" ("
                    +COLUMN_ID+" ,"+COLUMN_NAME+" ,"+COLUMN_DEPARTMENT+" ) Values("+id+",'"+Cname+"','"+departmentname+"')");

            //            statement.execute("INSERT into "+TABLE_NAME+" ("
//                    +COLUMN_ID+" ,"+COLUMN_NAME+" ,"+COLUMN_DEPARTMENT+" ) Values(7,'ghi LTD','Accounting')");

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }

}
