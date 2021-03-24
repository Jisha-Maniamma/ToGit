package com.Java.Class1.Day12.Database3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/03/23 15:09
 */
public class DataSource {
    public static final String DB_NAME="music.db";
    public static final String CONNECTION="jdbc:sqlite:"+DB_NAME;

    public static final String TABLE_ALBUM="albums";
    public static final String TABLE_ALBUM_ID="_id";
    public static final String TABLE_ALBUM_NAME="name";
    public static final String TABLE_ALBUM_ARTIST="artist";

    public static final String TABLE_ARTIST="artists";
    public static final String TABLE_ARTIST_ID="_id";
    public static final String TABLE_ARTIST_NAME="name";

    public static final String TABLE_SONG="song";
    public static final String TABLE_SONG_ID="_id";
    public static final String TABLE_SONG_TRACK="track";
    public static final String TABLE_SONG_TITLE="title";
    public static final String TABLE_SONG_ALBUM="album";

    private Connection conn;

    public boolean open(){
        try{
            conn= DriverManager.getConnection(CONNECTION);
            return true;
        }catch(SQLException e){
            System.out.println("The error is- "+e.getMessage());

            return false;
        }
    }

    public void close(){
        try{
            if(conn!=null)
                conn.close();

        }catch(SQLException e){
            System.out.println("The error is- "+e.getMessage());
        }
    }
    public List<Artists> querryArtist(){
//        Statement statement=null;
//        ResultSet result=null;
        try(Statement statement= conn.createStatement();
            ResultSet result= statement.executeQuery("SELECT * FROM "+TABLE_ARTIST)){
//            Statement statement= conn.createStatement();
//            ResultSet result= statement.executeQuery("SELECT * FROM "+TABLE_ARTIST)
            List<Artists> artists=new ArrayList<>();

            while(result.next()){
                Artists artist=new Artists();
                artist.setId(result.getInt(TABLE_ARTIST_ID));
                artist.setName(result.getString(TABLE_ARTIST_NAME));

                artists.add(artist);

            }
            return artists;
        }catch(SQLException e){
            System.out.println("The error is- "+e.getMessage());
            return null; }


    }
    public static void main(String[] args) {

//         conn= DriverManager.getConnection(CONNECTION);
//        Statement statement= conn.createStatement();

    }
}
