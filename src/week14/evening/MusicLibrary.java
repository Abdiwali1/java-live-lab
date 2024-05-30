package week14.evening;

import java.util.LinkedList;
import java.util.List;

public class MusicLibrary {
    private List<Playlist> library;

    public MusicLibrary(){
        library = new LinkedList<>();
    }

    // addPlaylist(playList): Adds the given PlayList object to the MusicLibrary.
    public void addPlaylist(Playlist playlistToAdd){
        library.add(playlistToAdd);
    }

    //removePlayList(name): Removes the playlist with the specified name from the MusicLibrary.
    public void removePlaylist(String name){
        library.removeIf(eachPlaylist -> eachPlaylist.getName().equalsIgnoreCase(name));
    }

    //getPlaylist(name): Returns the PlayList object with the given name from the list.

    public Playlist getPlaylist(String name){
        for(Playlist each : library){
            if(each.getName().equalsIgnoreCase(name)){
                return each;
            }
        }
        return null;
    }

    // displayMusicLibrary(): Displays playlists and songs of each playlist in the MusicLibrary object.
    public void displayMusicLibrary(){
        library.forEach(each -> each.displayPlaylist());
    }

    public List<Playlist> getLibrary() {
        return library;
    }

}
/*
3. Create a custom class named MusicLibrary with the following specifications:

    Attributes:
        playlists (List<PlayList> and should be LinkedList): Used for storing PlayList objects.

    Actions:
        addPlaylist(playList): Adds the given PlayList object to the MusicLibrary.
        removePlayList(name): Removes the playlist with the specified name from the MusicLibrary.
        getPlaylist(name): Returns the PlayList object with the given name from the list.
        displayMusicLibrary(): Displays playlists and songs of each playlist in the MusicLibrary object.

 */