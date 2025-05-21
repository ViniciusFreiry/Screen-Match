package br.com.screenmatch.template;

public class Movie {
    private String name;
    private int releaseYear;
    private boolean includedInThePlan;
    private double totalReview;
    private int reviewQuantity;
    private int durationInMinutes;

    public int getReviewQuantity() {
        return reviewQuantity;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void viewSpecs() {
        System.out.println("br.com.screenmatch.template.Movie Name: " + name);
        System.out.println("Release Year: " + releaseYear);
    }

    public void addReview(double newReview) {
        totalReview += newReview;
        reviewQuantity++;
    }

    public boolean isIncludedInThePlan() {
        return includedInThePlan;
    }

    public double getAverageRating() {
        return totalReview / reviewQuantity;
    }
}
