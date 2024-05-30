package week14.evening;

import java.util.LinkedHashMap;
import java.util.Map;

public class Playlist {

    private String name;
    private Map<String, Song> songs;

    public Playlist(String name) {
        this.name = name;
        songs = new LinkedHashMap<>();
    }

    //addSong(Song): Takes a Song object and adds it to the map of songs.
    public void addSong(Song song){
        songs.put(song.getTitle(), song);
    }

    //removeSong(title): Takes a string argument and removes the song with the matching title from the map.
    public void removeSong(String title){
        songs.remove(title);
    }

    //displayPlayList(): Displays each Song object in the playlist.
    public void displayPlaylist(){
        System.out.println("Playlist: " + name);
        for(Song eachSong : songs.values()){
            System.out.println(eachSong);
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Song> getSongs() {
        return songs;
    }

}

/*

2. Create a custom class named PlayList with the following specifications:

    Attributes:
        name (String): Used for storing the name of the playlist.
        songs (Map<String, Song>): Used for storing the title of the song as the key and the corresponding Song object as the value.

    Encapsulate the fields, but only generate a getter for the variable `songs`.

    Add a constructor that can set the name of the playlist.

    Actions:
        addSong(Song): Takes a Song object and adds it to the map of songs.
        removeSong(title): Takes a string argument and removes the song with the matching title from the map.
        displayPlayList(): Displays each Song object in the playlist.
 */