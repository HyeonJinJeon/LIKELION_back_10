package com.example.day10;

import java.util.ArrayList;
import java.util.List;

public class CollectionExam01 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(arrayList.size());

        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        System.out.println(arrayList.size());

        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        System.out.println(arrayList.size());

        System.out.println(arrayList.indexOf("a"));//존재하는지 안 하는지 (존재하면 0, 존재하지 않으면 -1)

        for(String str : arrayList) {
            System.out.println(str);
        }

        System.out.println("===============");
        System.out.println(arrayList.get(4));
        System.out.println(arrayList.getFirst());
        System.out.println(arrayList.getLast());

        System.out.println("===============");

//        Vector<String> vector = new Vector<>();
        ArrayList<String> vector = new ArrayList<>();

//        vector.addElement("a");
//        vector.addElement("b");
        vector.add("a");
        vector.add("b");
        vector.add("c");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        System.out.println(integerList);
        int value = integerList.get(0);
        System.out.println(integerList);
        System.out.println(integerList.remove(0));
        System.out.println(integerList);
        System.out.println(integerList.contains(5));
        System.out.println(integerList.remove(Integer.valueOf(2)));
        System.out.println(integerList);
        integerList.add(5);
        integerList.add(5);
        System.out.println(integerList);
        integerList.remove(Integer.valueOf(5));
        System.out.println(integerList);
        integerList.clear();
        System.out.println(integerList);
    }
}
