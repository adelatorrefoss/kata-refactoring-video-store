package video_store;

public class MovieType {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    public static MovieType create(int priceCode) {
        if (priceCode == NEW_RELEASE) {
            return new NewReleaseMovieType();
        } else if (priceCode == REGULAR) {
            return new RegularMovieType();
        } else if (priceCode == CHILDRENS) {
            return new ChildrenMovieType();
        }

        return null;
    }


    double getAmount(int daysRented) {
        return 0;
    }

    public int getPriceCode() {
        return 0;
    }

    int getFrequentPoints(int daysRented) {
        return 0;
    }

    private static class NewReleaseMovieType extends MovieType {

        @Override
        double getAmount(int daysRented) {
            return daysRented * 3;
        }

        @Override
        public int getPriceCode() {
            return MovieType.NEW_RELEASE;
        }

        @Override
        int getFrequentPoints(int daysRented) {
            int frequentPoints = 1;

            if (
                    daysRented > 1)
                frequentPoints += 1;
            return frequentPoints;
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

        @Override
        public int getPriceCode() {
            return MovieType.REGULAR;
        }

        @Override
        int getFrequentPoints(int daysRented) {
            return 1;
        }

    }

    private static class ChildrenMovieType extends MovieType {
        @Override
        double getAmount(int daysRented) {
            double amount;
            amount = 1.5;
            if (daysRented > 3)
                amount += (daysRented - 3) * 1.5;
            return amount;
        }

        @Override
        public int getPriceCode() {
            return MovieType.CHILDRENS;
        }

        @Override
        int getFrequentPoints(int daysRented) {
            return 1;
        }
    }
}
