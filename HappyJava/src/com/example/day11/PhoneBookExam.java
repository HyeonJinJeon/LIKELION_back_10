package com.example.day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PhoneBookExam {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("전현진", "010-3738-5466");
        phoneBook.put("신짱구", "010-1111-2222");
        phoneBook.put("김철수", "010-3333-4444");

        String hyeonjinNumber = phoneBook.get("전현진");
        System.out.println(hyeonjinNumber);

        //key를 Set레 저장하여 전체 key와 value를 찾는 방법
        System.out.println("전체 전화번호 목록");
        Set<String> keySet = phoneBook.keySet();
//        Iterator<String> iterator = keySet.iterator();
        for(String key : keySet){
            System.out.println(key + ": " + phoneBook.get(key));

        }

        phoneBook.remove("김철수");

        //entrySet 메소드를 이용하여 전체 key와 value를 찾는 방법
        System.out.println("전체 전화번호 목록");
        for(Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        //Map이 비었는지 확인
        System.out.println("비었어요?" + phoneBook.isEmpty());

        //Map 크기 확인
        System.out.println(phoneBook.size());
    }
}