package com.example.day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(111, "jeon");
        map.put(222, "kim");
        map.put(333, "park");

        System.out.println(map);

        System.out.println(map.get(111));

        Set<Integer> keySet = map.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while(iterator.hasNext()){
            Integer key = iterator.next();
            System.out.println("________________________");
            System.out.println("key: " + key);
            System.out.println("value: " + map.get(key));
        }

        for(Integer key : keySet){
            System.out.println("________________________");
            System.out.println("key: " + key);
            System.out.println("value: " + map.get(key));
        }
    }
}
