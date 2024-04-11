package com.example.day08;

public class ExceptionExam04 {
    public static void 심부름() {
        System.out.println("심부름 시작!!");

        int i = 0;
        try {
            System.out.println(10/i);
        }catch (Exception e){
            System.out.println("다른 마트로 감");
        }

        System.out.println("심부름 끝");
    }
    public static void main(String[] args) {
        심부름();
    }
}
