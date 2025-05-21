package br.com.screenmatch.calcs;

import br.com.screenmatch.template.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void addTime(Title title) {
        totalTime += title.getDurationInMinutes();
    }
}
