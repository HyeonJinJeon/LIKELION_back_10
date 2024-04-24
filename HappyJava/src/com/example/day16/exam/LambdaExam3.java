package com.example.day16.exam;

//문제 3: 리스트의 각 요소에 연산 적용하기
//요구 사항: 주어진 List<Integer>의 각 요소에 10을 더한 결과를 새 리스트에 저장하고 출력하라. 람다식을 사용하여 List의 forEach() 메서드를 활용하라.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExam3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,3,7,5,3,7,9,6);
        List<Integer> plus10 = new ArrayList<>();
        list.forEach(number -> plus10.add(number+10));
        System.out.println(plus10);
    }
}
