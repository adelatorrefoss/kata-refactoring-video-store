package video_store;

public class Rental {
    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    private Movie movie;
    private int daysRented;

    double amount() {
        return movie.getAmount(getDaysRented());
    }

    int frequentPoints() {
        Movie movie = this.getMovie();
        int frequentPoints = 1;

        if (movie.getPriceCode() == MovieType.NEW_RELEASE
                && getDaysRented() > 1)
            frequentPoints += 1;
        return frequentPoints;
    }
}
