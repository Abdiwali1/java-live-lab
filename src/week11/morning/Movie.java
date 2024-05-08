package week11.morning;

public final class Movie {

    private String movie;
    private int rating;
    private int duration;
    private int year;

    public Movie(String movie, int rating, int duration, int year) {
        this.movie = movie;
        this.rating = rating;
        this.duration = duration;
        this.year = year;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
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
                "movie='" + movie + '\'' +
                ", rating=" + rating +
                ", duration=" + duration +
                ", year=" + year +
                '}';
    }
}
