package br.com.screenmatch.calcs;

import br.com.screenmatch.template.Title;

public class RecommendationFilter {
    public void filter(Rates rates) {
        if (rates.getRate() >= 4) {
            System.out.println("One of the current favorites!");
        } else if (rates.getRate() >= 2) {
            System.out.println("Currently highly rated!");
        } else {
            System.out.println("Add it to your watchlist.");
        }
    }
}