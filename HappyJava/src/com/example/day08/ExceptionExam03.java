package com.example.day08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionExam03 {
    public static void main(String[] args) throws FileNotFoundException{
        //예외 종류 2가지
        //1. 실행시 발생하는 예외(Runtime Exception) : 즉, 컴파일 할 때느느 오류가 발생하지 않는다.
        //2. 컴파일시 체크하는 예외(Checked Exception)

        //예외 처리 방법 2가지
        //1. try-catch로 직접 처리하는 방법
        //2. throws 하는 방법
//        try{
            FileInputStream fis = new FileInputStream("abc");
//        } catch(FileNotFoundException e){
//            e.printStackTrace();
//        }
        System.out.println("zz");
    }
}
