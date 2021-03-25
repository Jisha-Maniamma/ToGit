package com.Java.Class1.Day12.Database3;

import java.util.List;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/03/23 14:54
 */
public class Main {

    public static void main(String[] args) {
        DataSource dataSource=new DataSource();
        if(!dataSource.open()){
            System.out.println("cant open");
            return;
        }


        System.out.println("//////////////////////////////////////////////");
        //TO PRINT ARTISTS IN DESIRED ORDER
        List<Artists> artists=dataSource.querryArtist(DataSource.ORDER_BY_ASC);
        if(artists==null){
            System.out.println("Empty artist data in the database");
            return;
        }
        for(Artists a:artists){
            System.out.println("The name  of the artist is- "+a.getName());
        }


        System.out.println("//////////////////////////////////////////////");
        //to print nam of albums by any given artist
        List<String> AlbumsByArtists=dataSource.queryAlbumsForartist("Iron Maiden",DataSource.ORDER_BY_ASC);
        for (String a:AlbumsByArtists){
            System.out.println(" The songs by Iron Maiden is- "+a.toString());
        }


        System.out.println("//////////////////////////////////////////////");
        //to get details about the song
        List<SongArtistAlbum> allAboutGivenSong=dataSource.QuerySongDetails("Go Your Own Way",DataSource.ORDER_BY_ASC);
        for(SongArtistAlbum a:allAboutGivenSong){
            System.out.println("The song artist is- "+a.getArtistName());
            System.out.println("The song is in album- "+a.getAlbumName());
            System.out.println("The song is in track- "+a.getSongTrackNumber());
        }

        System.out.println("//////////////////////////////////////////////");
        //to get count of any table
        System.out.println("The count of items in the table "+DataSource.TABLE_SONG+ " is- "+dataSource.getCount(DataSource.TABLE_SONG));
        System.out.println("The count of items in the table "+DataSource.TABLE_ARTIST+ " is- "+dataSource.getCount(DataSource.TABLE_ARTIST));
        System.out.println("The count of items in the table "+DataSource.TABLE_ALBUM+ " is- "+dataSource.getCount(DataSource.TABLE_ALBUM));

        System.out.println("//////////////////////////////////////////////");
        //to get count of any table
        if(dataSource.createNewView())
            System.out.println("congraualation... the new view- "+DataSource.NEW_VIEW_NAME+" was created ");
        else
            System.out.println("sorry");

        dataSource.close();
    }
}
