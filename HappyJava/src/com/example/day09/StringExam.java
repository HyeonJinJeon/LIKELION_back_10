package com.example.day09;

public class StringExam {
    public static void main(String[] args) {
        System.out.println(checkItemNumber("te3456"));
        System.out.println(checkItemNumber("t33456"));
        System.out.println(checkItemNumber("ar49786"));
        System.out.println(checkItemNumber("test56"));
    }
    public static boolean checkItemNumber(String num) {

        // 조건1. 물품번호의 길이는 6이다.
        if (num.length() != 6) {
            return false;
        }

        // 조건2. 물품번호의 1,2 번째 자리는 알파벳이어야 한다. (대소문자 모두 가능)
        char char1 = Character.toUpperCase(num.charAt(0));
        char char2 = Character.toUpperCase(num.charAt(1));
        if (((int)char1 > 90 || (int)char1 < 65) || ((int)char2 > 90 || (int)char2 < 65) ) {
            return false;
        }

        // 조건3. 물품번호의 3-6 자리수는 숫자만 가능하다.
        for (int i = 2; i < num.length(); i++) {
            if (!Character.isDigit(num.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
