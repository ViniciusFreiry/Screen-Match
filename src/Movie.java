public class Movie {
    String name;
    int releaseYear;
    boolean includedInThePlan;
    private double totalReview;
    private int reviewQuantity;
    int durationInMinutes;

    int getReviewQuantity() {
        return reviewQuantity;
    }

    void viewSpecs() {
        System.out.println("Movie Name: " + name);
        System.out.println("Release Year: " + releaseYear);
    }

    void addReview(double newReview) {
        totalReview += newReview;
        reviewQuantity++;
    }

    double getAverageRating() {
        return totalReview / reviewQuantity;
    }
}
