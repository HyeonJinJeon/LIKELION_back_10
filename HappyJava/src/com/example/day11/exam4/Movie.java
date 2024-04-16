package com.example.day11.exam4;

public class Movie implements Comparable<Movie>{
    private String name;
    private int year;
    private double rating;

    public Movie(String name, int year, double stars) {
        this.name = name;
        this.year = year;
        this.rating = stars;
    }

    @Override
    public String toString() {
        return "제목: " + name + " 제작년도: " + year + " 평점: " + rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public int compareTo(Movie o) {
        return this.name.compareTo(o.name);
    }
}
