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


    double getAmount(int daysRented) {
        return 0;
    }

    private static class NewReleaseMovieType extends MovieType {

        @Override
        double getAmount(int daysRented) {
            return daysRented * 3;
        }
    }

    private static class RegularMovieType extends MovieType {
        @Override
        double getAmount(int daysRented) {
            double amount = 2;
            if (daysRented > 2)
                amount += (daysRented - 2) * 1.5;
            return amount;
        }

    }
}
