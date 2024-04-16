package com.example.day11;

import java.util.*;

public class IteratorExam {
    public static void main(String[] args) {
        System.out.println("____________________list____________________");
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        //for문으로 원소 찾기
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("____________________");

        //iterator 객체 생성
        Iterator<String> iter1 =  list.iterator();

        //iterator로 원소 찾기
        while(iter1.hasNext()){
            System.out.println(iter1.next());
        }
        System.out.println("____________________");

        //for-each로 원소 찾기
        for(String str : list){
            System.out.println(str);
        }

        System.out.println("____________________set____________________");
        //Set은 순서가 없어서 꺼낼 때 get 메소드가 없다!
        Set<String> set = new HashSet<>();
        set.add("d");
        set.add("e");
        set.add("f");

        Iterator<String> iter2 =  set.iterator();

        //iterator로 원소 찾기
        while (iter2.hasNext()){
            System.out.println(iter2.next());
        }
        System.out.println("____________________");

        //for-each로 원소 찾기
        for(String str : set) {
            System.out.println(str);
        }
    }
}
