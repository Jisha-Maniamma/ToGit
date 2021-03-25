package com.Java.Class1.Day12.Database3;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/03/25 9:49
 *
 * Using this class- query the song ...
 * to get its album name (album table), artist name (artist table) and track number (Songs table)
 */
public class SongArtistAlbum {
    private String artistName;
    private String albumName;
    private int songTrackNumber;

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getSongTrackNumber() {
        return songTrackNumber;
    }

    public void setSongTrackNumber(int songTrackNumber) {
        this.songTrackNumber = songTrackNumber;
    }
}
