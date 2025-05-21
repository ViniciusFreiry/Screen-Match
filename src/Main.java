import br.com.screenmatch.calcs.TimeCalculator;
import br.com.screenmatch.template.Movie;
import br.com.screenmatch.template.Serie;

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

        Serie mySerie = new Serie();
        mySerie.setName("Lost");
        mySerie.setReleaseYear(2000);
        mySerie.viewSpecs();

        mySerie.setSeasons(10);
        mySerie.setEpisodesPerSeason(10);
        mySerie.setMinutesPerEpisode(50);
        System.out.println("Duration of Losf in Minutes: " + mySerie.getDurationInMinutes());

        TimeCalculator timeCalculator = new TimeCalculator();
        timeCalculator.addTime(myMovie);

        Movie otherMovie = new Movie();

        otherMovie.setName("Avatar");
        otherMovie.setReleaseYear(2023);
        otherMovie.setDurationInMinutes(200);
        timeCalculator.addTime(otherMovie);

        timeCalculator.addTime(mySerie);
        System.out.println(timeCalculator.getTotalTime());
    }
}