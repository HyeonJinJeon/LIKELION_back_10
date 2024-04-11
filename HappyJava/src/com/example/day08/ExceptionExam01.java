package com.example.day08;

public class ExceptionExam01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        //예외 상황을 마주하면 그 다음 작업을 하나도 할 수 없다.
        //따라서 예외처리가 필요하다.

        //try에서 예외가 발생되면 예외가 발생한 시점부터 try의 마지막까지 실행을 할 수 없다.
        //따라서 try를 잘 묶어줘야 된다.
        try {
//            int result = 10/0;
            System.out.println(arr[3]);
            System.out.println("거울을 본다.");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(arr[0]);
        }

        System.out.println("다음 문장1");
        System.out.println("다음 문장2");
        System.out.println("다음 문장3");
        System.out.println("end!!");
    }
}
