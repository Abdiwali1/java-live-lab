package week14.evening;


import week14.evening.Playlist;
import week14.morning.PlayList;


public class TestEverything {
    public static void main(String[] args) {
        // Creating songs
        Song song1 = new Song("Shape of You", "Ed Sheeran", "Pop", 2017);
        Song song2 = new Song("Blinding Lights", "The Weeknd", "Synthwave", 2020);
        Song song3 = new Song("Bohemian Rhapsody", "Queen", "Rock", 1975);
        Song song4 = new Song("Stairway to Heaven", "Led Zeppelin", "Rock", 1971);
        Song song5 = new Song("Hotel California", "Eagles", "Rock", 1976);
        Song song6 = new Song("Billie Jean", "Michael Jackson", "Pop", 1982);
        Song song7 = new Song("Like a Rolling Stone", "Bob Dylan", "Folk Rock", 1965);
        Song song8 = new Song("Smells Like Teen Spirit", "Nirvana", "Grunge", 1991);

        // Creating playlists
        Playlist playlist1 = new Playlist("Favorites");
        playlist1.addSong(song1);
        playlist1.addSong(song2);

        Playlist playlist2 = new Playlist("Classics");
        playlist2.addSong(song3);
        playlist2.addSong(song4);
        playlist2.addSong(song5);

        Playlist playlist3 = new Playlist("Current");
        playlist3.addSong(song6);
        playlist3.addSong(song7);
        playlist3.addSong(song8);

        // Creating music library
        MusicLibrary library = new MusicLibrary();
        library.addPlaylist(playlist1);
        library.addPlaylist(playlist2);
        library.addPlaylist(playlist3);

        // Displaying music library
        library.displayMusicLibrary();

        // Removing a song
        playlist1.removeSong("Shape of You");
        System.out.println("------------------- library again after removing");
        // Displaying music library again
        library.displayMusicLibrary();

        // additional: print all the names of the songs that were released before 1980

        for(Playlist eachPlaylist : library.getLibrary()){
            for(Song eachSong : eachPlaylist.getSongs().values()){
                if(eachSong.getReleaseYear() < 1980){
                    System.out.println(eachSong.getTitle());
                }
            }
        }

        /*
            library -> MusicLibrary object
            .getLibrary() -> List<Playlist>
             eachPlaylist.getSongs() -> Map<String, Song>
             eachPlaylist.getSongs().values() -> Collection<Song> ->
         */

    }
}
