package com.example.day08;


public class ExceptionExam05 {
    public static void 심부름() throws Exception{
        System.out.println("심부름 시작!!");

        int i = 0;
//        try {
        System.out.println(10/i);
//        }catch (Exception e){
//            System.out.println("다른 마트로 감");
//        }

        System.out.println("심부름 끝");
    }
    public static void main(String[] args) {
        try{
            심부름();
        }catch (Exception e){
            System.out.println("동생에게 시킴");
        }
    }
}
