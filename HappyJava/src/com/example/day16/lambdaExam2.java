package com.example.day16;

import java.util.*;
import java.util.function.Consumer;

public class lambdaExam2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,2,5,7);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a.compareTo(b);
            }
        });

        Collections.sort(numbers, (Integer a, Integer b) -> a.compareTo(b));

        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                System.out.println(n);
            }
        });
    }
}
