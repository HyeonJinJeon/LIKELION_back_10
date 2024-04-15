package com.example.day10;

import com.example.day09.Book;
//제네릭

public class GenericPair <T1, T2>{
    private T1 first;
    private T2 second;

    //객체가 생성되는 시점에 제네릭 타입이 바뀐다!!
    public GenericPair(T1 first, T2 second){
        this.first = first;
        this.second = second;
    }

    public T1 getFirst() {
        return first;
    }

    public void setFirst(T1 first) {
        this.first = first;
    }

    public T2 getSecond() {
        return second;
    }

    public void setSecond(T2 second) {
        this.second = second;
    }

    public static void main(String[] args) {
        GenericPair<String, Integer> genericPair = new GenericPair<>("hello", 4);
        String first = genericPair.getFirst();
        int second = genericPair.getSecond();

        GenericPair<Book, String> genericPair2 = new GenericPair<>(new Book("모두의 자바"), "전현진");
        Book book = genericPair2.getFirst();
        String name = genericPair2.getSecond();
        System.out.println(book.getTitle() + " " +  name);
    }
}
