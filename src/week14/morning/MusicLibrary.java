package week14.morning;

import java.util.*;

public class MusicLibrary {

    public List<PlayList> playLists = new LinkedList<>();

    public void addPlaylist(PlayList playlist) {
        playLists.add(playlist);
    }

    // this method is removing some playlist from music library
    public void removePlayList(String name) {
        for (PlayList playlist : playLists) {
            if(playlist.getName().equals(name)){
                playLists.remove(playlist);
            }
        }
    }

    public PlayList getPlaylist(String name) {
        for (PlayList playList : playLists) {
            if (playList.getName().equals(name)) {
                return playList;
            }
        }
        return null;
    }

    public void displayMusicLibrary() {
        for (PlayList playlist : playLists) {
            System.out.println("playlist.getName() = " + playlist.getName());
            playlist.displayPlayList();
        }
    }
}

