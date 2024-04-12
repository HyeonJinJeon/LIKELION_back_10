package com.example.day09;

import java.util.Scanner;

public class StringExam3 {
    //문자열을 입력받아서 역순의 문자열로 바꾸어서 문자열을 리턴하는 메소드
    public static String reverseChange(String str) {
        StringBuilder sb = new StringBuilder(str);
        String result = sb.reverse().toString();
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요");
        String str = sc.next();
        System.out.println(reverseChange(str));
    }
}
