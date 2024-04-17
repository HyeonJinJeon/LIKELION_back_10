package com.example.day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExam2 {
    public static void main(String[] args) {
        //파일로 부터 읽어서 -- 입력 통로가 필요
        //파일에 쓴다. -- 출력 통로가 필요
//        FileInputStream fis = null;
//        FileOutputStream fos = null;

        //만약 close를 구현하고 있으면 try()의 괄호 안에 선언한 객체는 자동으로 close를 해준다!!
        //ByteStreamExam의 코드와 비교(finally의 작성 푤요 없어짐!!)
        try(FileInputStream fis = new FileInputStream("src/com/example/day12/ReadFile.java");
            FileOutputStream fos = new FileOutputStream("src/com/example/day12/outputTile.txt");){

            int c ;
            while((c = fis.read()) != -1){
                fos.write(c);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}