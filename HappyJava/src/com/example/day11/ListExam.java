package com.example.day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        String firstFruit = fruits.get(0);
        System.out.println(firstFruit);
        System.out.println(fruits.getFirst());

        System.out.println(fruits);
        fruits.set(1, "blueberry");
        System.out.println(fruits);

        fruits.remove("cherry");
        System.out.println(fruits);

//        fruits.remove(0);
        fruits.removeFirst();
        System.out.println(fruits);

        List<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");

        linkedList.remove("a");

        fruits.add("orange");
        fruits.add("mango");
        fruits.add("strawberry");
        System.out.println(fruits);
        Collections.shuffle(fruits);
        System.out.println(fruits);

        Collections.sort(fruits);
        System.out.println(fruits);
    }
}
