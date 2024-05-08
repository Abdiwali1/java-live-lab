package week11.evening;

import java.util.ArrayList;

public final class Cinema implements PlayMovie{

    private String location;
    private int numberOfTheaters;
    private ArrayList<Movie> allMovies;

    public Cinema(String location, int numberOfTheaters, ArrayList<Movie> allMovies) {
        this.location = location;
        this.numberOfTheaters = numberOfTheaters;
        this.allMovies = new ArrayList<>(allMovies);
    }

    @Override
    public void playMovie(Movie movie) {
        System.out.println(movie.getTitle() + " Starting, please grab your popcorn and turn your phones off");
    }

    // skipping the buyTicket method - not that import for the idea

    @Override
    public String toString() {
        return "Cinema{" +
                "location='" + location + '\'' +
                ", numberOfTheaters=" + numberOfTheaters +
                ", allMovies=" + allMovies +
                '}';
    }
}
/*
- Create a final class Cinema
        create the following instance variables:
            location, number of theaters, List of Movies

        create a constructor to initialize all the variables

        implement the PlayMovie & implement the playMovie method to say: "Moving Starting, please grab your popcorn and turn your phones off"

        create a method buyTicket(Movie):
            print how much a movie ticket is. The cost is based on the rating of the movie. If it is a 5 the movie costs 25, if it is 3 or 4 it cost 20 and any other rating is 15

        create a toString that will display the information about the Cinema and which Movies are available to watch
 */