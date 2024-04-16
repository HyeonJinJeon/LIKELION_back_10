package com.example.day11.exam3;

public class Book implements Comparable<Book>{
    private String name;
    private String author;
    private int year;

    @Override
    public int compareTo(Book o) {
        return this.year - o.year;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "도서명: " + name + " | 저자: " +author + " | 출판년도: " + year;
    }

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }
}
