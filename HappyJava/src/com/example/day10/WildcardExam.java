package com.example.day10;

import java.util.List;
import java.util.Arrays;

public class WildcardExam {
    // 아래 두 메소드는 같은 값을 나타낸다! 즉, 비슷한 코드라고 봐도 무방하다.
    // 하지만 와일드카드는 읽는거에 더 적합하다.
    public static void printList(List<?> list) {;
        for (Object element : list) {
            System.out.println(element);
        }
    }
    public static <T> void printList2(List<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<String> stringList = Arrays.asList("Hello", "World");
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);

        printList(intList);    // 출력: 1, 2, 3
        printList(stringList); // 출력: Hello, World
        printList(doubleList); // 출력: 1.1, 2.2, 3.3

        printList2(intList);    // 출력: 1, 2, 3
        printList2(stringList); // 출력: Hello, World
        printList2(doubleList); // 출력: 1.1, 2.2, 3.3
    }

}