package week14.morning;

import java.util.*;

public class PlayList {

    private String name;
    private Map<String, Song> songs;

    public Map<String, Song> getSongs() {
        return songs;
    }

    public String getName() {
        return name;
    }

    public PlayList(String name, Map<String, Song> songs) {
        this.name = name;
        this.songs = songs;
    }

    public void addSong(Song song) {
        songs.put(song.getTitle(), song);
    }

    public void removeSong(String songTitle) {
        songs.remove(songTitle);
    }

    public void displayPlayList() {
        for (Song song : songs.values()) {
            System.out.println(song.toString());
        }
    }


}
