package com.example.day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(){

    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age; // 나이를 기준으로 오름차순 정렬
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " : " + age;
    }

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("park", 32));
        list.add(new Person("jeon", 26));
        list.add(new Person("kim", 15));

        System.out.println(list);

        //comparable이 정의되어있지 않아서 오료가 난다
        //따라서 comparable을 구현한 후 compareTo() 메소드를 어버라이딩 해준다
        //위에 오버리이딩한 compareTo에 의해서 나이로 정렬이 된다.
        Collections.sort(list);
        System.out.println(list);



//        Comparator 인터페이스는 객체들을 특정한 기준으로 정렬할 때 사용됩니다.
//        이 인터페이스는 compare 메소드를 오버라이드하여 두 객체를 비교하는 방식을 정의합니다.
//        Comparator 는 Comparable 과 달리 객체 외부에서 정렬 기준을 정의하므로,
//        여러 다른 기준으로 객체를 정렬할 수 있는 유연성을 제공합니다.

//        sort에 comparator를 익명객체로 따로 구현하여 이름순으로 정렬해준다.
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(list);
    }
}