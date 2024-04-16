package com.example.day11;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCharacters {
    public static void main(String[] args) {
        String input = "banana";
        Set<Character> chars = new LinkedHashSet<>();

        for(char ch : input.toCharArray()) {
            chars.add(ch);
        }

        System.out.println("Unique characters: ");
        for(char ch : chars) {
            System.out.println(ch);
        }
    }
}
