package video_store;

public class Movie {
    private final MovieType type;
    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
        this.type = MovieType.create(priceCode);
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int code) {
        priceCode = code;
    }

    public String getTitle() {
        return title;
    }

    double getAmount(int daysRented) {
        return type.getAmount(daysRented);
    }
}
