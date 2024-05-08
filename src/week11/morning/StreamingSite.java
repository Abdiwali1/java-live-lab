package week11.morning;

public abstract class StreamingSite implements HasSubscription, PlayMovie {

    String url;
    double subscriptionAmount;
    int moviesAvailable;

    public StreamingSite(String url, double subscriptionAmount, int moviesAvailable) {
        this.url = url;
        this.subscriptionAmount = subscriptionAmount;
        this.moviesAvailable = moviesAvailable;
    }

    public abstract void  pause();
}
