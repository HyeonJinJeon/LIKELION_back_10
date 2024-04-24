package com.example.day16.exam;

//문제 5: 요소 변환하기
//요구 사항: 주어진 List<Integer>의 각 요소를 제곱한 결과를 새 리스트에 저장하고 출력하라. for 루프와 람다식을 활용하여 각 요소를 변환하라.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExam5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,2,1,4,6,4,3);
        List<Integer> copy = new ArrayList<>();
//        list.forEach(number -> copy.add(number*number));
        Consumer<Integer> consumer = number -> copy.add(number*number);

        for(Integer number : list){
            consumer.accept(number);
        }
        System.out.println(copy);
    }
}
