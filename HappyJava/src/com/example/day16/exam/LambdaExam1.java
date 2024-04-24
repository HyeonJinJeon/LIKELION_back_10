package com.example.day16.exam;

//문제 1: 문자열 리스트 정렬하기
//요구 사항: 주어진 List<String>을 문자열 길이에 따라 정렬하되, 람다식을 사용하여 Collections.sort() 메서드를 활용하라.

import java.util.Arrays;
import java.util.List;

public class LambdaExam1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "hi", "good", "apple");
        list.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println(list);
    }
}
