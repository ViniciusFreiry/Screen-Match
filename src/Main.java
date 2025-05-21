public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();

        myMovie.name = "O Poderoso Chefão";
        myMovie.releaseYear = 1970;
        myMovie.durationInMinutes = 180;

        myMovie.viewSpecs();
        myMovie.addReview(8);
        myMovie.addReview(5);
        myMovie.addReview(10);

        System.out.println(myMovie.getAverageRating());
        System.out.println("Review Quantity: " + myMovie.getReviewQuantity());
    }
}