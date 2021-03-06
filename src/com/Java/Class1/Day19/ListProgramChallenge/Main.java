package com.Java.Class1.Day19.ListProgramChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/05/19 8:07
 */
public class Main {
    private static Scanner scan=new Scanner(System.in);
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

        album=new album("Chitraaaa","Navya Nair");
        album.addSong("111111",5.03);
        album.addSong("222222",4.25);
        album.addSong("333333",4.00);
        album.addSong("333333",4.00);
        album.addSong("ccccccccc",4.00);
        albums.add(album);

        album=new album("Chitraaaa","SRK");
        album.addSong("111111",5.03);
        album.addSong("222222",4.25);
        album.addSong("333333",4.00);
        album.addSong("333333",4.00);
        album.addSong("ccccccccc",4.00);
        albums.add(album);


        List<song> playlist=new ArrayList<>();
        albums.get(0).addToPlaylist("333333",playlist);
        albums.get(0).addToPlaylist(3,playlist);
//        albums.get(1).addToPlaylist("333333",playlist);
//        albums.get(1).addToPlaylist(0,playlist);

        ListIterator<album> listIterator= albums.listIterator();
        listIterator.next();
//        while(listIterator.hasNext()){
//            System.out.println("1"+listIterator.hasNext());
//            System.out.println("2"+listIterator.next());
//            listIterator.remove();
//            System.out.println("3"+listIterator.hasNext());
//        }
//
//        ListIterator<album> listIterator1= albums.listIterator();
//        listIterator1.remove();
//        while(listIterator1.hasNext()){
//            System.out.println("1"+listIterator1.hasNext());
//            System.out.println("2"+listIterator1.next());
//            listIterator1.remove();
//            System.out.println("3"+listIterator1.hasNext());
//        }
//        if(!listIterator1.hasNext()){
//            System.out.println("noooooo");
//        }
        System.out.println(".......................");
        listIterator.remove();
        if(listIterator.hasNext()) {
            System.out.println("Now playing " + listIterator.next().toString());
        } else if(listIterator.hasPrevious()) {
            System.out.println("Now playing " + listIterator.previous());
        }

        System.out.println(".......................");



        ListIterator listIterator1=albums.listIterator();
        boolean proceed=true;
        boolean GoingForwsrd=true;
        while(proceed){
            System.out.println("press 1 to go forward and 2 to go backword");
            int s=scan.nextInt();
            scan.nextLine();

            switch(s){


                case 1:
                    if(!GoingForwsrd){
                        if(listIterator1.hasNext()){
                            listIterator1.next();
                        }
                        GoingForwsrd=true;
                    }
                    if(listIterator1.hasNext()){
                        System.out.println(listIterator1.next());
                    }else{
                        System.out.println("reached last of list");
                    }

                    break;
                case 2:
                    if(GoingForwsrd){
                        if(listIterator1.hasPrevious()){
                            listIterator1.previous();
                        }
                        GoingForwsrd=false;
                    }
                    if(listIterator1.hasPrevious()){
                        System.out.println(listIterator1.previous());
                    }else{
                        System.out.println("reached starting of list");
                    }
                    break;


            }

        }

    }






}
