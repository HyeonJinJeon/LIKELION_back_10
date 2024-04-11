package com.example.day08;

public class ExceptionExam08 {
    static void checkAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("나이가 너무 어립니다.");
        }
    }
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (CustomException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }
}
