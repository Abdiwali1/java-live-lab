package week11.evening;

public final class Amazon extends StreamingSite{
    public Amazon(double subscriptionAmount, int moviesAvailable) {
        super("www.AmazonVideo.com", subscriptionAmount, moviesAvailable);
    }

    @Override
    public void pause() {
        System.out.println("Here are some products you would like");
    }

    @Override
    public void subscribe() {
        System.out.println("With amazon prime");
    }

    @Override
    public void playMovie(Movie movie) {
        System.out.println("Now playing" + movie.getTitle());
    }
}