package br.com.screenmatch.main;

import br.com.screenmatch.calcs.RecommendationFilter;
import br.com.screenmatch.calcs.TimeCalculator;
import br.com.screenmatch.template.Episode;
import br.com.screenmatch.template.Movie;
import br.com.screenmatch.template.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("O Poderoso Chefão", 1970);

        myMovie.setDurationInMinutes(180);

        myMovie.viewSpecs();
        myMovie.addReview(8);
        myMovie.addReview(5);
        myMovie.addReview(10);

        System.out.println(myMovie.getAverageRating());
        System.out.println("Review Quantity: " + myMovie.getReviewQuantity());

        Serie mySerie = new Serie("Lost", 2000);
        mySerie.viewSpecs();

        mySerie.setSeasons(10);
        mySerie.setEpisodesPerSeason(10);
        mySerie.setMinutesPerEpisode(50);
        System.out.println("Duration of Losf in Minutes: " + mySerie.getDurationInMinutes());

        TimeCalculator timeCalculator = new TimeCalculator();
        timeCalculator.addTime(myMovie);

        Movie otherMovie = new Movie("Avatar", 2023);

        otherMovie.setDurationInMinutes(200);
        timeCalculator.addTime(otherMovie);

        timeCalculator.addTime(mySerie);
        System.out.println(timeCalculator.getTotalTime());

        RecommendationFilter filter = new RecommendationFilter();
        filter.filter(myMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(mySerie);
        episode.setTotalViews(325);
        filter.filter(episode);

        Movie anotherMovie = new Movie("Dogville", 2003);
        anotherMovie.setDurationInMinutes(200);
        anotherMovie.addReview(10);

        ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add(anotherMovie);
        moviesList.add(myMovie);
        moviesList.add(otherMovie);
        System.out.println("Size of List: " + moviesList.size());
        System.out.println("First Movie: " + moviesList.get(0).getName());
        System.out.println(moviesList);
    }
}