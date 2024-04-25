package com.example.day17.exam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Num2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> result = words.stream().filter(n -> n.length() > 5).collect(Collectors.toList());
        System.out.println(result);
    }

}
