package com.example.day16.exam;

//문제 6: 모든 요소에 대해 조건 확인하기
//요구 사항: 주어진 List<Integer>의 모든 요소가 짝수인지 확인하라. 람다식을 활용하여 조건 검사를 수행하고 결과를 출력하라.

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExam6 {
    public static void main(String[] args) {
        boolean flag = true;

        List<Integer> list = Arrays.asList(1,5,4,3,7,8,4);

        Predicate<Integer> findEven = number -> number % 2 == 0;
        for(Integer number : list){
            if (!findEven.test(number)){
                flag = false;
                break;
            }
        }
        System.out.println(flag);

        List<Integer> even = Arrays.asList(2,4,6,8);
        flag = true;
        for(Integer number : even){
            if (!findEven.test(number)){
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
