package com.Java.Class1.Day19.ListProgramChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/05/19 8:34
 */
public class album {
    private String albumName,artistName;
    private List<song> songs;

    public album(String artistName, String albumName) {
        this.albumName = albumName;
        this.artistName=artistName;
        songs =new ArrayList<>();
    }

    public boolean addSong(String SongName,double duration){
        song s=new song(SongName,duration);
        //System.out.println(findSong(s));
        if(!findSong(s)){
            songs.add(s);
            return true;
        }
        System.out.println("sorry this song "+SongName+" already exists in the album");
        return false;
    }

    private boolean findSong(song s){
        ListIterator<song> listIterator= songs.listIterator();
        while(listIterator.hasNext()){
            String name=listIterator.next().getSongTitle();
            if(name.equalsIgnoreCase(s.getSongTitle())) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return albumName;
    }

    private song findSong(String songName){

        for(song a:songs){

            if(a.getSongTitle().equalsIgnoreCase(songName)){
                return a;
            }


        }
        return null;
    }

    public void addToPlaylist(int trackNumber,List<song> playlistName){
        //System.out.println();
        if(trackNumber-1>0 && trackNumber-1<=songs.size()){
            playlistName.add(songs.get(trackNumber-1));
            System.out.println(" could add");
        }
        System.out.println("sory couldnot b added");
    }
    public void addToPlaylist(String title,List<song> playlistname){

        if(findSong(title)!=null){
            playlistname.add(findSong(title));
            System.out.println("added the song into the playList");

        }else{
            System.out.println("sory this song dsnt exists in the album");
        }
    }

}
