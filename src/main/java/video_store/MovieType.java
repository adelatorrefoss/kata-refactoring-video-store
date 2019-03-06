package video_store;

public class MovieType {
    public static MovieType create(int priceCode) {
        if (priceCode == Movie.NEW_RELEASE) {
            return new NewReleaseMovieType();
        } else if (priceCode == Movie.REGULAR) {
            return new RegularMovieType();
        }


        return null;
    }


    double getAmount(int daysRented, Rental rental) {
        return 0;
    }

    private static class NewReleaseMovieType extends MovieType {

    }

    private static class RegularMovieType extends MovieType {
        double getAmount(int daysRented, Rental rental) {
            double amount = 2;
            if (rental.getDaysRented() > 2)
                amount += (daysRented - 2) * 1.5;
            return amount;
        }
    }
}
