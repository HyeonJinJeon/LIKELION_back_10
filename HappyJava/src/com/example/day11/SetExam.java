package com.example.day11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExam {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        System.out.println(set);
        if(set.contains("a")){
            System.out.println("a를 갖고있습니다");
        }

        //중복된 자료가 들어가지 않는다.
        //즉, 중복되지 않는 유일한 요소를 저장한다!!
        set.add("a");
        System.out.println(set);

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        list.add("a");
        System.out.println(list);

        //값이 아닌 주소값을 비교하기에 중복이 허용되었다.
        //따라서 Pen클래스에서 equals()와 hashcode()를 오버라이딩하여 같은 값이라는 것을 정의하면 중복 저장이 안된다.
        Set<Pen> penSet = new HashSet<>();
        penSet.add(new Pen("red"));
        penSet.add(new Pen("black"));
        penSet.add(new Pen("blue"));

        System.out.println(penSet);
        penSet.add(new Pen("red"));
        System.out.println(penSet);
    }
}
