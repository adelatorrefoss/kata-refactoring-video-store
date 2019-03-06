package video_store;

public class Movie {
    private MovieType type;
    private String title;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.type = MovieType.create(priceCode);
    }

    public void setPriceCode(int code) {
        this.type = MovieType.create(code);
    }

    public String getTitle() {
        return title;
    }

    double getAmount(int daysRented) {
        return type.getAmount(daysRented);
    }

    int getFrequentPoints(int daysRented) {
        return type.getFrequentPoints(daysRented);
    }

}
