package com.example.day17;

import java.util.Arrays;
import java.util.List;

public class ReduceTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        //reduce는 결과를 누적한다
        numbers.stream().reduce(0, (a, b) -> a + b);

        List<Member> memberList = Arrays.asList(
                new Member("jeon", 100),
                new Member("kim", 80),
                new Member("hwang", 70),
                new Member("lee", 90)
        );

        //Member 들의 score 총합을 구해보자
        int scoreSum = memberList.stream().mapToInt(Member::getScore).sum();
        System.out.println(scoreSum);

        int scoreSum2 = memberList.stream().mapToInt(Member::getScore)
                .reduce((a, b) -> a+b).getAsInt();
        System.out.println(scoreSum2);
    }
}
