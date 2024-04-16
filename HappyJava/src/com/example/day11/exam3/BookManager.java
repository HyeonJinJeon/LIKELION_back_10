package com.example.day11.exam3;

import java.util.*;

public class BookManager {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        for(Book book : books){
            System.out.println("도서명: " + book.getName() + " | 저자: " + book.getAuthor() + " | 출판년도: " + book.getYear());
        }
    }

    public void sortBooksByYear() {
        Collections.sort(books);
        System.out.println(books);
    }
}
