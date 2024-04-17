package com.example.day12;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutExam {
    public static void main(String[] args) {
        //원시데이터타입으로 파일에 쓰고 싶다.
        try(
            //FileOutputStream fos = new FileOutputStream("data.txt");
            //DataOutputStream dos = new DataOutputStream(fos);
            //위의 두 줄을 간략화 시킨 것
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));){
            dos.writeBoolean(true);
            dos.writeByte(Byte.MAX_VALUE);
            dos.writeChar('a');
            dos.writeDouble(1.1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
