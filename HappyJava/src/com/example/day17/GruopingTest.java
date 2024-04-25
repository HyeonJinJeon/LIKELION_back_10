package com.example.day17;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GruopingTest {
    public static void main(String[] args) {
        List<Member> memberList= Arrays.asList(
            new Member("jeon", 26, Member.MALE),
            new Member("kim", 25, Member.FEMALE),
            new Member("lee", 23, Member.MALE),
            new Member("park", 28, Member.FEMALE)
        );

        Map<Integer, List<Member>> mapBySex = memberList.stream()
                .collect(Collectors.groupingBy(Member::getSex));

        System.out.println("남자 ");
        mapBySex.get(Member.MALE).stream()
                .forEach(member -> System.out.println(member.getName()));

        System.out.println("여자 ");
        mapBySex.get(Member.FEMALE).stream()
                .forEach(member -> System.out.println(member.getName()));
    }
}
