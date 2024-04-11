package com.example.day08;

//사용자 정의 예외 클래스
public class MyException extends RuntimeException{
    public MyException(){
        super("점수는 0~100까지 입력 받을 수 있습니다,");
    }
    public MyException(String msg){
        super(msg);
    }
}
