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






        dataSource.close();
    }
}
