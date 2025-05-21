public class Movie {
    String name;
    int releaseYear;
    boolean includedInThePlan;
    double totalReview;
    int reviewQtd;
    int durationInMinutes;

    void viewSpecs() {
        System.out.println("Movie Name: " + name);
        System.out.println("Release Year: " + releaseYear);
    }

    void addReview(double newReview) {
        totalReview += newReview;
        reviewQtd++;
    }

    double getAverageRating() {
        return totalReview / reviewQtd;
    }
}
