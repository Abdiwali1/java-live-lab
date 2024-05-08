package week11.morning;

import java.util.*;

public final class User {

    public static void main(String[] args) {

        List<Movie> movieList = new ArrayList<>();


        Movie movie1 = new Movie("Harry Porter", 5, 187, 2004);
        movieList.add(movie1);
        Cinema cinema = new Cinema("New York", 19, movieList);
        Netflix netflix = new Netflix("Netfilx.com", 9.99, 200);
        Amazon amazon = new Amazon("Amazon.com", 5.5, 100);
        Hulu hulu = new Hulu("Hulu.com", 7, 300);

        List<StreamingSite> sites = new ArrayList<>();
        sites.add(netflix);
        sites.add(amazon);
        sites.add(hulu);

        for (StreamingSite site : sites) {
            site.subscribe();
            site.pause();
        }

        List<PlayMovie> playMovies = new ArrayList<>();
        playMovies.add(cinema);
        playMovies.add(netflix);
        playMovies.add(amazon);
        playMovies.add(hulu);

        Cinema fairfax = new Cinema("Fairfax", 5, movieList);
        Cinema vienna = new Cinema("Vienna", 4, movieList);
        Cinema chantilly = new Cinema("Chantilly", 7, movieList);

        List<Cinema> cinemaList = new ArrayList<>();
        cinemaList.add(fairfax);
        cinemaList.add(vienna);
        cinemaList.add(chantilly);

        for (Cinema cinemaCurrent : cinemaList) {
            for (int i = 0; i < cinemaCurrent.numberOfTheaters; i++) {
                cinemaCurrent.buyTicket(movie1);
            }
        }


    }

    public static StreamingSite streamingSite(List<StreamingSite> sitesTocheck) {
        StreamingSite result = new Amazon("amazon.com", 4, 200);

        for (StreamingSite site : sitesTocheck) {
            if (site.moviesAvailable > result.moviesAvailable || site.subscriptionAmount < result.subscriptionAmount) {
                result = site;
            }
        }

        return result;

    }


}
