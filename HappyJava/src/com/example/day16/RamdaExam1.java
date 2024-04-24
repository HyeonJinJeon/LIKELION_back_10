package com.example.day16;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class RamdaExam1 {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "cherry");
        Consumer<String> ramdaTest = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        items.forEach(item -> System.out.println(item));

        items.forEach(ramdaTest);
        items.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("111. Thread start!!");
            }
        }).start();

        new Thread(()-> System.out.println("222. Thread start!!")).start();
    }
}
