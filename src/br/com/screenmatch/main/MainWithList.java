package br.com.screenmatch.main;

import br.com.screenmatch.template.Movie;
import br.com.screenmatch.template.Serie;
import br.com.screenmatch.template.Title;

import java.util.ArrayList;

public class MainWithList {
    public static void main(String[] args) {
        Movie myMovie = new Movie("O Poderoso Chefão", 1970);
        myMovie.addReview(9);
        Movie otherMovie = new Movie("Avatar", 2023);
        otherMovie.addReview(6);
        Movie anotherMovie = new Movie("Dogville", 2003);
        anotherMovie.addReview(10);
        Serie mySerie = new Serie("Lost", 2000);

        ArrayList<Title> list = new ArrayList<>();
        list.add(anotherMovie);
        list.add(myMovie);
        list.add(otherMovie);
        list.add(mySerie);

        for (Title item: list) {
            System.out.println(item);

            if (item instanceof Movie movie && movie.getRate() > 2) {
                System.out.println("Stars: " + movie.getRate() + "\n");
            }
        }
    }
}