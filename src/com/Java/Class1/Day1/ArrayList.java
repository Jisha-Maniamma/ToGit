package com.Java.Class1.Day1;

import java.util.List;
import java.util.Scanner;

public class ArrayList {
    private static Scanner scan= new Scanner(System.in);
    private static String playlist;
    public static void main(String[] args) {
        List<String> songs=new java.util.ArrayList<>();
        System.out.println("Enter your playlist name that you wish to create");
         playlist=scan.nextLine();
        //scan.nextLine();
        boolean flag=true;
        while(flag){
            System.out.println("Enter your choice \n 1.To add song \n 2.To find song \n 3.To exit");
            int choice=scan.nextInt();
            scan.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Enter the song title");
                    String song=scan.nextLine();
                    addsong(songs,song);
                    break;
                case 2:
                    System.out.println("Enter the song if you wish to find in Playlist");
                    String findSong=scan.nextLine();
                    find(songs,findSong);
                    break;
                case 3:
                    System.out.println("Thank you for your time...see you soon...");
                    flag=false;
                    break;
                default:
                    System.out.println("Invalid entry");
                    break;

            }
        }
    }

    private static void find(List<String> songs, String findSong) {
       int possition= songs.indexOf(findSong);
       if(possition>=0)
           System.out.println("this song is in your playlist- "+playlist);
       else
           System.out.println("Sorry! Kindly check the spelling and search again");
    }

    private static void addsong(List<String> songs, String song) {
        songs.add(song);
        System.out.println("Song added to your playlist: "+playlist);
    }
}
