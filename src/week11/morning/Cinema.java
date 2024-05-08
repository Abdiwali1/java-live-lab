package week11.morning;

import java.util.*;

public final class Cinema implements PlayMovie {

    //location, number of theaters, List of Movies
    String location;
    int numberOfTheaters;
    List<Movie> listOfMovies;

    public Cinema(String location, int numberOfTheaters, List<Movie> listOfMovies) {
        this.location = location;
        this.numberOfTheaters = numberOfTheaters;
        this.listOfMovies = listOfMovies;
    }


    @Override
    public void playMovie(Movie movie) {
        System.out.println("Moving Starting, please grab your popcorn and turn your phones off");


    }

    public void buyTicket(Movie movie){
        int price = 0;
        switch (movie.getRating()){
            case 5:
                price = 25;
                break;
            case 4:
                price = 20;
                break;
            case 3:
                price = 20;
                break;
            case 2:
                price = 15;
                break;
        }
        System.out.println("The ticket price is: " + price);
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "location='" + location + '\'' +
                ", numberOfTheaters=" + numberOfTheaters +
                ", listOfMovies=" + listOfMovies +
                '}';
    }



}
