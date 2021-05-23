package com.Java.Class1.Day20;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/05/19 12:59
 */
public class main {
}


class album{
    private String albumName;
    private List<song> songs;

    public album(String albumName) {
        this.albumName = albumName;
        this.songs=new ArrayList<>();
    }

    public void addSongs(String songName, int durationOfSong){

    }

    public void addToPlaylist(String songName, List<song> playList){

    }

    public boolean isSongExistingInAlbum(){
        return true;
    }



}
class song{
    private String songName;
    private int songDuration;

    public song(String songName, int songDuration) {
        this.songName = songName;
        this.songDuration = songDuration;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public int getSongDuration() {
        return songDuration;
    }

    public void setSongDuration(int songDuration) {
        this.songDuration = songDuration;
    }

    @Override
    public String toString() {
        return "song name: "+songName+" duration: "+songDuration;
    }
}
