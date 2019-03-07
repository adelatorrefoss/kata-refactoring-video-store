package video_store;

public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }


    double amount() {
        return movie.getAmount(daysRented);
    }

    int frequentPoints() {
        return movie.getFrequentPoints(daysRented);
    }

    String getTitle() {
        return getMovie().getTitle();
    }
}
