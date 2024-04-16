package com.example.day11.exam3;

public class Main {
    public static void main(String[] args) {
        BookManager manager = new BookManager();
        manager.addBook(new Book("모두의 자바", "강경미", 2015));
        manager.addBook(new Book("이거이 자바다", "신용권", 2018));
        manager.addBook(new Book("자바의 정석", "남궁성", 2013)); // 중복 추가 시도

        manager.displayBooks();
        manager.sortBooksByYear();
    }
}