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

    double amount(Movie movie) {
        double amount = 0;
        switch (movie.getPriceCode()) {
            case Movie.REGULAR:
                amount += 2;
                if (getDaysRented() > 2)
                    amount += (getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                amount += getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                amount += 1.5;
                if (getDaysRented() > 3)
                    amount += (getDaysRented() - 3) * 1.5;
                break;
        }
        return amount;
    }

    int frequentPoints(Movie movie) {
        int fp = 1;

        if (movie.getPriceCode() == Movie.NEW_RELEASE
                && getDaysRented() > 1)
            fp += 1;
        return fp;
    }
}
