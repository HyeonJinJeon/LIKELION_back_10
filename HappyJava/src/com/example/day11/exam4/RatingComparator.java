package com.example.day11.exam4;

import java.util.Comparator;

public class RatingComparator implements Comparator<Movie>{

    @Override
    public int compare(Movie o1, Movie o2) {
        return Double.compare(o1.getRating(), o2.getRating());
    }
}
