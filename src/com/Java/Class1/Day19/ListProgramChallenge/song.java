package com.Java.Class1.Day19.ListProgramChallenge;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/05/19 8:07
 */
public class song {
private String songTitle;
private double songDration;

    public song(String songTitle, double songDration) {
        this.songTitle = songTitle;
        this.songDration = songDration;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public double getSongDration() {
        return songDration;
    }

    public void setSongDration(double songDration) {
        this.songDration = songDration;
    }
}
