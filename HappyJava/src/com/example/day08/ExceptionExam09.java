package com.example.day08;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionExam09 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("abc");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        }

        //자동 리소스 닫기
        //finally의 내용을 try의 ()안에서 수행해줌
        try(FileInputStream fis2 = new FileInputStream("abc")){
            //처리할 로직..
            //처리가 끝나면 자동으로 FileInputStream이 닫힘
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
