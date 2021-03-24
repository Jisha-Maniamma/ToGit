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
    public static final String COLUMN_ALBUM_ID ="_id";
    public static final String COLUMN_ALBUM_NAME ="name";
    public static final String COLUMN_ALBUM_ARTIST ="artist";
    //////////////////////////
    public static final int INDEX_ALBUM_ID=1;
    public static final int INDEX_ALBUM_NAME=2;
    public static final int INDEX_ALBUM_ARTISTS=3;
    //////////////////////////
    public static final String TABLE_ARTIST="artists";
    public static final String COLUMN_ARTIST_ID ="_id";
    public static final String COLUMN_ARTIST_NAME ="name";
    public static final int INDEX_ARTIST_ID=1;
    public static final int INDEX_ARTIST_NAME=2;
    //////////////////////////
    public static final String TABLE_SONG="song";
    public static final String COLUMN_SONG_ID ="_id";
    public static final String COLUMN_SONG_TRACK ="track";
    public static final String COLUMN_SONG_TITLE ="title";
    public static final String COLUMN_SONG_ALBUM ="album";
    public static final int INDEX_SONG_ID=1;
    public static final int INDEX_SONG_TRACK=2;
    public static final int INDEX_SONG_TITLE=3;
    public static final int  INDEX_SONG_ALBUM=4;
    //////////////////////////
    public static final int ORDER_BY_NONE=1;
    public static final int ORDER_BY_ASC=2;
    public static final int ORDER_BY_DESC=3;



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
    public List<Artists> querryArtist(int orderChoice){
//        Statement statement=null;
//        ResultSet result=null;
        StringBuilder sb=new StringBuilder("SELECT * FROM ");
        sb.append(TABLE_ARTIST);
        if(orderChoice!=1){
            sb.append(" ORDER BY ");
            sb.append(COLUMN_ARTIST_NAME);
            if(orderChoice==ORDER_BY_ASC){
                sb.append(" ASC");
            }
            else{
                sb.append(" DESC");
            }
        }
        try(Statement statement= conn.createStatement();
            ResultSet result= statement.executeQuery(sb.toString())){
//            Statement statement= conn.createStatement();
//            ResultSet result= statement.executeQuery("SELECT * FROM "+TABLE_ARTIST)
            List<Artists> artists=new ArrayList<>();

            while(result.next()){
                Artists artist=new Artists();
                artist.setId(result.getInt(INDEX_ARTIST_ID));
                artist.setName(result.getString(INDEX_ARTIST_NAME));

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
