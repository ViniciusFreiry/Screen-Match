import br.com.screenmatch.template.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();

        myMovie.setName("O Poderoso Chefão");
        myMovie.setReleaseYear(1970);
        myMovie.setDurationInMinutes(180);

        myMovie.viewSpecs();
        myMovie.addReview(8);
        myMovie.addReview(5);
        myMovie.addReview(10);

        System.out.println(myMovie.getAverageRating());
        System.out.println("Review Quantity: " + myMovie.getReviewQuantity());
    }
}