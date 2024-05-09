package week11.evening;

public final class Netflix extends StreamingSite{
    public Netflix(double subscriptionAmount, int moviesAvailable) {
        super("www.Netflix.com", subscriptionAmount, moviesAvailable);
    }

    @Override
    public void pause() {
        System.out.println("Are you still watching?");
    }

    @Override
    public void subscribe() {
        System.out.println("Paying to netflix 15$");
    }

    @Override
    public void playMovie(Movie movie) {
        System.out.println(movie.getTitle() + " playing on netflix for " + movie.getMinutes());
    }
}

/*
    - Create a final class Netflix
        inherit the StreamingSite class and implement all the methods
 */