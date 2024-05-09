package week11.evening;

import java.util.ArrayList;

public class User {
    public static void main(String[] args) {

        Movie avatar = new Movie("Avatar", 7.9, 162, 2009);
        Movie interstellar = new Movie( "Interstellar", 8.7, 169, 2014);

        ArrayList<Movie> allMovies = new ArrayList<>();
        allMovies.add(avatar);
        allMovies.add(interstellar);

        Cinema amc = new Cinema("239738 Hollywood Dr", 14, allMovies);
        System.out.println(amc);
        amc.playMovie(avatar);

        Netflix netflix = new Netflix(15, 300);
        System.out.println(netflix);
        netflix.subscribe();
        netflix.playMovie(avatar);
        netflix.pause();

        ArrayList<StreamingSite> ourStreamingSites = new ArrayList<>();
        ourStreamingSites.add(netflix);
        ourStreamingSites.add(new Amazon(10, 450));
        //ourStreamingSites.add(amc);

        for(StreamingSite each : ourStreamingSites){
            each.subscribe();
        }

        ArrayList<PlayMovie> allMedia = new ArrayList<>();
        allMedia.add(amc);
        allMedia.add(netflix);
        allMedia.add(new Amazon(10, 250));

        System.out.println("\nPlay a movie on all the media types: everything that is a PlayMovie");

        for(PlayMovie each : allMedia){
            each.playMovie(interstellar);
        }

        System.out.println(filterSites(ourStreamingSites));


    }

    public static StreamingSite filterSites(ArrayList<StreamingSite> sites){
        StreamingSite mostMovies = sites.get(0); // max logic
        for(StreamingSite each : sites){
            if(each.getMoviesAvailable() > mostMovies.getMoviesAvailable()){
                mostMovies = each;
            }
        }
        return mostMovies;
    }

}
/*
Movie Part 2 [abstraction, polymorphism, final, classes, objects, ArrayList]

    - Create a final class User
        create a main method and create Movie, Cinema, Netflix, Amazon, & Hulu objects
        create a List of all the StreamingSites used. Then subscribe to them all.
            extra: you can also pause the movie
        create a List of PlayMovie and add multiple different Cinema and StreamingSite objects. Then play your favorite movie on all of the options

        create a method to determine which StreamingSite is the best for you.
            parameter: StreamingSite
            return: StreamingSite

            options to check if the site is for you:
                subscription is the cheapest
                or has the most number of movies

        create a List of Cinema in your area. A new movie came out, and you want to support it,
        so you buy a ticket for that movie from every Cinema in your area.
 */