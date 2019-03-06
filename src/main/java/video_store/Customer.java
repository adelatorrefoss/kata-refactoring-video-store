package video_store;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.addElement(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        String result = "Rental Record for " + getName() + "\n";

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();

            // determines the amount for each line
            Movie movie = each.getMovie();
            double thisAmount = each.amount(movie);

            int fp = frequentPoints(each, movie);

            frequentRenterPoints += fp;
            result += "\t" + movie.getTitle() + "\t"
                    + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;

        }

        result += "You owed " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points\n";

        return result;
    }

    private int frequentPoints(Rental each, Movie movie) {
        int fp = 1;

        if (movie.getPriceCode() == Movie.NEW_RELEASE
                && each.getDaysRented() > 1)
            fp += 1;
        return fp;
    }


    private String name;
    private Vector rentals = new Vector();
}
