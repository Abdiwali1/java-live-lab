package week14.morning;

import java.util.*;

public class SongTest {

    public static void main(String[] args) {
        Song song1 = new Song("Bohemian Rhapsody", "Queen", "Rock", 1975);
        Song song2 = new Song("Stairway to Heaven", "Led Zeppelin", "Rock", 1971);
        Song song3 = new Song("Imagine", "John Lennon", "Rock", 1971);

        Map<String, Song> rockSongs = new HashMap<>();
        rockSongs.put("song1", song1);
        rockSongs.put("song2", song2);
        rockSongs.put("song3", song3);

        PlayList rock = new PlayList("rock", rockSongs);

        MusicLibrary rockLibrary = new MusicLibrary();
        rockLibrary.addPlaylist(rock);

        rock.displayPlayList();

        rockLibrary.displayMusicLibrary();

        System.out.println("*************************************");
        for (Song song : rockSongs.values()) {
            if(song.getReleaseYear() == 1971){
                System.out.println(song.toString());
            }
        }
    }
}
