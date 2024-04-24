package com.example.day16.exam;

//문제 4: 조건에 맞는 요소 찾기
//요구 사항: 주어진 List<String>에서 글자 수가 5 이상인 첫 번째 단어를 찾아 출력하라. for 루프와 람다식을 활용하여 조건에 맞는 요소를 찾아보세요.

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class LambdaExam4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hi", "good", "apple", "banana", "cherry");
        Function<String, String> findStr = s -> s.length() >= 5 ? s : "";
        for(String str : list){
            if(!findStr.apply(str).equals("")){
                System.out.println(findStr.apply(str));
                break;
            }
        }
    }
}
