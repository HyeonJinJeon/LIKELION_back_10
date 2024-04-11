package com.example.day08;

public class ExceptionExam06 {
    //1. 예외가 밸생했고, 그 예외를 잘 처리한 상황
    //2.
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        try{
            System.out.println("try start!");
            int result = 10 / 2;
            System.out.println(arr[2]);

            arr = null;
            System.out.println(arr[0]);

            System.out.println("tyr end");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds catch block");
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            System.out.println("NullPointerException catch block");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("반드시 실행됨");
        }

        System.out.println("다음 문장1");
        System.out.println("다음 문장2");
        System.out.println("다음 문장3");
        System.out.println("end!!");
    }
}
