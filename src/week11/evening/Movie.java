package week11.evening;

public final class Movie {
    private String title;
    private int rating;
    private double minutes;
    private int year;

    public Movie(String title, int rating, double minutes, int year) {
        this.title = title;
        this.rating = rating;
        this.minutes = minutes;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getMinutes() {
        return minutes;
    }

    public void setMinutes(double minutes) {
        this.minutes = minutes;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", minutes=" + minutes +
                ", year=" + year +
                '}';
    }
}
/*
 - Create a final class Movie
        create the following instance variables:
            title, rating(out of 5), duration(minutes), year

        create a constructor to initialize all the variables

        encapsulate the class

        create a toString to print the information of the Movie
 */
