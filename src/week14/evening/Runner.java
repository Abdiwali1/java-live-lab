package week14.evening;

import java.util.Map;

public class Runner {
    public static void main(String[] args) {

        // make a couple Song objects
        Song hbd = new Song("Happy Birthday", "James Bond", "classical", 1990);
        Song biondVax = new Song("Hurndall", "BiondVax", "Rock", 1700);

        //make a playlist

        Playlist roadTripPlaylist = new Playlist("Road Trip");
        roadTripPlaylist.displayPlaylist();
        roadTripPlaylist.addSong(hbd);
        roadTripPlaylist.addSong(biondVax);
        roadTripPlaylist.addSong(new Song("Lofi Study Music", "study", "Lofi", 2020));
        System.out.println("--------------");
        roadTripPlaylist.displayPlaylist();
        System.out.println("--------------");
        System.out.println(roadTripPlaylist.getSongs());

        System.out.println("-------------- print the map: k - v: approach 1");

        // option 1
        for(String key : roadTripPlaylist.getSongs().keySet()){
            System.out.println(key + " - " + roadTripPlaylist.getSongs().get(key));
        }

        // option 2
        System.out.println("-------------- print the map: k - v: approach 2");
        for(Map.Entry<String, Song> each : roadTripPlaylist.getSongs().entrySet()){ // this will return a Set of the entries. key = title, value = Song
            System.out.println(each.getKey() + " - " + each.getValue());
        }
        System.out.println("-------------- print the map: k - v: approach 3");
        // option 3
        roadTripPlaylist.getSongs().forEach( (k,v) -> System.out.println(k + " - " + v));

        /*
            roadTripPlaylist -> reference to our Playlist object
            .getSongs() -> getter for the Songs instance variable -> Map
            .entrySet() -> Set<Entry> = Set<Map.Entry<String, Song>
            or
            .keySet() -> Set<Key> = Set<String>
         */
        System.out.println(roadTripPlaylist.getName());
    }
}
