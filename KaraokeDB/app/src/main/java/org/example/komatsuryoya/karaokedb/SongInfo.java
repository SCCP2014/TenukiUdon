package org.example.komatsuryoya.karaokedb;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Komatsu Ryoya on 2015/01/29.
 */
@DatabaseTable(tableName = "songs")
public class SongInfo {

    @DatabaseField(id = true)
    private int id;

    @DatabaseField
    private String name;

    @DatabaseField
    private String artist;

    @DatabaseField
    private String lRange;

    @DatabaseField
    private String hRange;

    @DatabaseField
    private int difficulty;

    public SongInfo() {
    }

    public SongInfo(int id, String name, String artist, String lRange, String hRange, int difficulty) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.lRange = lRange;
        this.hRange = hRange;
        this.difficulty = difficulty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getLRange() {
        return lRange;
    }

    public void setLRange(String lRange) {
        this.lRange = lRange;
    }

    public String getHRange() {
        return hRange;
    }

    public void setHRange(String hRange) {
        this.hRange = hRange;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
}