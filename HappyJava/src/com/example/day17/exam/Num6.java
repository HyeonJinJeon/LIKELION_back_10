package com.example.day17.exam;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Num6 {
    public static void main(String[] args) {
        List<Student2> students = Arrays.asList(
                new Student2("Alice", 14, 88),
                new Student2("Bob", 23, 82),
                new Student2("Charlie", 17, 95),
                new Student2("David", 21, 73)
        );
        //첫번째 방법
        Map<Integer, List<Student2>> map = students.stream().collect(Collectors.groupingBy(s-> s.getAge()/10*10));
        double result1 = map.get(10).stream().mapToInt(s -> s.getScore()).average().orElse(-1);
        double result2 = map.get(20).stream().mapToInt(s -> s.getScore()).average().orElse(-1);

        System.out.println("10s: " + result1);
        System.out.println("20s: " + result2);

        //두번째 방법
        Map<Integer, Double> map2 = students.stream()
                .collect(Collectors.groupingBy(
                        a -> (a.getAge() / 10) * 10,
                        Collectors.averagingDouble(Student2::getScore)
                ));

        map2.forEach((a, b) -> System.out.println(a + "s : " + b));

    }
}
class Student2 {
    private String name;
    private int age;
    private int score;

    public Student2(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }
}
