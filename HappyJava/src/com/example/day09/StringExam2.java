package com.example.day09;

public class StringExam2 {
    // 문자열을 입력받아서 공백의 개수를 리턴하는 메소드
    public static int spaceCount(String str) {
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                cnt++;
            }
        }
        return cnt;
    }

    // 문자열을 입력받아서 알파벳 개수를 리턴하는 메소드
    public static int alphaCount(String str) {
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // 알파벳인지 확인
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(spaceCount("test tset ts ttt")); // 3
        System.out.println(alphaCount("test tset ts ttt")); // 13
    }
}
