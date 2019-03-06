package video_store;

public class Movie {
    private MovieType type;
    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
        this.type = MovieType.create(priceCode);
    }

    public int getPriceCode() {
        return type.getPriceCode();
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
}
