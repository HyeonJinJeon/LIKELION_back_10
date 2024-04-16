package com.example.day10;

import com.example.day08.CustomException;
import com.example.day08.MyException;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionExam03 {

    public void readScores(Scanner input, ArrayList<Integer> scores) {
        System.out.println("추가할 점수 입력 (0을 누르면 종료됩니다)");
        while(true){
            int score = input.nextInt();
            if(score < 0 || score > 100){
                throw new MyException("점수는 0~100까지 입력 받을 수 있습니다, 당신이 입력한 점수는 : " + score);
            } else if(score == 0){
                System.out.println("점수 추가를 종료합니다.");
                break;
            } else{
                scores.add(score);
            }
        }
    }

    public void removeZero(ArrayList<Integer> scores){
        scores.remove(Integer.valueOf(0));
    }

    public void printScores(ArrayList<Integer> scores){
        System.out.println(scores);
    }
//    // 점수 입력 받기
//    readScores(input, scores);
//
//    // 0점 제거
//    removeZero(scores);
//
//    // 결과 출력
//    printScores(scores);
//
//    // 리소스 정리
//        input.close();

    public static void main(String[] args) {
        CollectionExam03 collectionExam03 = new CollectionExam03();
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        try {
            collectionExam03.readScores(sc, arrayList);
            collectionExam03.removeZero(arrayList);
            collectionExam03.printScores(arrayList);
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
    }
}
