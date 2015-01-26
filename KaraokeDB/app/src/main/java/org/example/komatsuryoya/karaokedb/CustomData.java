package org.example.komatsuryoya.karaokedb;

/**
 * Created by Komatsu Ryoya on 2015/01/22.
 */
public class CustomData {
    private String songName_;
    private String songArtist_;
    private String songLowRange_;
    private String songHighRange_;
    private int songDifficulty_;

    public void setName(String text) {
        songName_ = text;
    }

    public String getName() {
        return songName_;
    }

    public void setArtist(String text) {
        songArtist_ = text;
    }

    public String getArtist() {
        return songArtist_;
    }

    public void setLRange(String text) {
        songLowRange_ = text;
    }

    public String getLRange() {
        return songLowRange_;
    }

    public void setHRange(String text) {
        songHighRange_ = text;
    }

    public String getHRange() {
        return songHighRange_;
    }

    public void setDifficulty(int diff) {
        songDifficulty_ = diff;
    }

    public int getDifficulty() {
        return songDifficulty_;
    }

}