package br.com.screenmatch.main;

import br.com.screenmatch.template.Movie;
import br.com.screenmatch.template.Serie;
import br.com.screenmatch.template.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainWithList {
    public static void main(String[] args) {
        Movie myMovie = new Movie("O Poderoso Chefão", 1970);
        myMovie.addReview(9);
        Movie otherMovie = new Movie("Avatar", 2023);
        otherMovie.addReview(6);
        Movie anotherMovie = new Movie("Dogville", 2003);
        anotherMovie.addReview(10);
        Serie mySerie = new Serie("Lost", 2000);

        List<Title> list = new ArrayList<>();
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

        List<String> searchForArtist = new ArrayList<>();
        searchForArtist.add("Arnold Schwarzenegger");
        searchForArtist.add("Tom Cruise");
        searchForArtist.add("Adam Sandler");
        System.out.println(searchForArtist);

        Collections.sort(searchForArtist);
        System.out.println(searchForArtist);

        Collections.sort(list);
        System.out.println(list);

        list.sort(Comparator.comparing(Title::getReleaseYear));
        System.out.println(list);
    }
}