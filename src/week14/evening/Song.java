package week14.evening;

public class Song {
    private String title;
    private String artist;
    private String genre;
    private int releaseYear;

    public Song(String title, String artist, String genre, int releaseYear) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}

/*
Practice Tasks:
1. Create a custom class named Song with the following specifications:

    Attributes:
        title (String): Represents the title of the song.
        artist (String): Represents the artist of the song.
        genre (String): Represents the genre of the song.
        releaseYear (int): Represents the release year of the song.

    Encapsulate all the fields.

    Add a constructor that can set all the fields.

    Add a toString() method.
 */