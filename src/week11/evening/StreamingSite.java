package week11.evening;

public abstract class StreamingSite implements PlayMovie, HasSubscription{

    private String url;
    private double subscriptionAmount;
    private int moviesAvailable;

    public StreamingSite(String url, double subscriptionAmount, int moviesAvailable) {
        this.url = url;
        this.subscriptionAmount = subscriptionAmount;
        this.moviesAvailable = moviesAvailable;
    }

    public abstract void pause();

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getSubscriptionAmount() {
        return subscriptionAmount;
    }

    public void setSubscriptionAmount(double subscriptionAmount) {
        this.subscriptionAmount = subscriptionAmount;
    }

    public int getMoviesAvailable() {
        return moviesAvailable;
    }

    public void setMoviesAvailable(int moviesAvailable) {
        this.moviesAvailable = moviesAvailable;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "url='" + url + '\'' +
                ", subscriptionAmount=" + subscriptionAmount +
                ", moviesAvailable=" + moviesAvailable +
                '}';
    }
}
/*
 Create an abstract class StreamingSite
        implement the PlayMovie & HasSubscription interfaces - don't need to implement the methods

        create the following instance variables:
            url, subscription amount, movies available(int)

        create a constructor to initialize all the variables

        create an abstract method:
            pause()
 */
