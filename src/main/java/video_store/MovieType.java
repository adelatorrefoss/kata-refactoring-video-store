package video_store;

public class MovieType {
    public static MovieType create(int priceCode) {
        if (priceCode == Movie.NEW_RELEASE) {
            return new NewReleaseMovieType();
        }
        return null;
    }


    private static class NewReleaseMovieType extends MovieType {
    }
}
