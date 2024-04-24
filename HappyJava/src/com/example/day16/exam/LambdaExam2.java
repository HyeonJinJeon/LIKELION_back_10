package com.example.day16.exam;

//문제 2: 최대값 찾기
//요구 사항: 주어진 정수 배열에서 최대값을 찾아 출력하라. 람다식을 사용하여 자바의 Comparator 인터페이스와 함께 Arrays.sort()를 활용하라.

import java.util.Arrays;
import java.util.Comparator;

public class LambdaExam2 {
    public static void main(String[] args) {
        Integer[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};

        // 배열을 내림차순으로 정렬
        Comparator<Integer> reverseComparator = (a, b) -> b - a;

        Arrays.sort(arr, reverseComparator);

        int max = arr[0];

        System.out.println("최대값: " + max);
    }
}
