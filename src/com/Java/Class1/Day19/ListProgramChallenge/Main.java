package com.Java.Class1.Day19.ListProgramChallenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/05/19 8:07
 */
public class Main {

    // Create a program that implements a playlist for songs
    // Create a Song class having Title and Duration for a song.
    // The program will have an Album class containing a list of songs.
    // The albums will be stored in an ArrayList
    // Songs from different albums can be added to the playlist and will appear in the list in the order
    // they are added.
    // Once the songs have been added to the playlist, create a menu of options to:-
    // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
    // List the songs in the playlist
    // A song must exist in an album before it can be added to the playlist (so you can only play songs that
    // you own).
    // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
    // started tracking the direction we were going.
    // As an optional extra, provide an option to remove the current song from the playlist
    // (hint: listiterator.remove()


    public static void main(String[] args) {
        List<album> albums=new ArrayList<>();
        album album=new album("Sonu Nigam","VeerZara");
        album.addSong("aaaaaaaaa",5.03);
        album.addSong("bbbbbbbbb",4.25);
        album.addSong("ccccccccc",4.00);
        albums.add(album);

        album=new album("Chitra","Mohan lal sir and Shobhana mam songs");
        album.addSong("111111",5.03);
        album.addSong("222222",4.25);
        album.addSong("333333",4.00);
        album.addSong("333333",4.00);
        album.addSong("ccccccccc",4.00);
        albums.add(album);

     List<song> playlist=new ArrayList<>();
     albums.get(0).addToPlaylist("333333",playlist);
        albums.get(0).addToPlaylist(3,playlist);
        albums.get(1).addToPlaylist("333333",playlist);
        albums.get(1).addToPlaylist(0,playlist);


    }




}
