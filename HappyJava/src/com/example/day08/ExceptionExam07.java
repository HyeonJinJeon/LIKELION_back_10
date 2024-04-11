package com.example.day08;

import java.util.Scanner;

public class ExceptionExam07 {
    //학생의 점수를 입력 받는 메소드
    public void inputScore(int score){

        if (score < 0 || score > 100){
//            System.out.println("점수는 0~100 사이만 입력할 수 있습니다");
//            return;
            throw new MyException("점수는 0~100까지 입력 받을 수 있습니다, 당신이 입력한 점수는 : "+score);
        }
        System.out.println(score);
    }

    public static void main(String[] args) {
        ExceptionExam07 exceptionExam07 = new ExceptionExam07();

        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하세요.");
        try {
            exceptionExam07.inputScore(sc.nextInt());
        } catch (MyException e){
            System.out.println(e.getMessage());
            exceptionExam07.inputScore(sc.nextInt());
        }

        System.out.println("main 종료!!");
    }
}
