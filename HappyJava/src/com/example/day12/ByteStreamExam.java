package com.example.day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExam {
    public static void main(String[] args) {
        //파일로 부터 읽어서 -- 입력 통로가 필요
        //파일에 쓴다. -- 출력 통로가 필요
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try{
            fis = new FileInputStream("src/com/example/day12/ReadFile.java");
            fos = new FileOutputStream("src/com/example/day12/outputTile.txt");

            int c ;
            while((c = fis.read()) != -1){
                fos.write(c);
            }
        } catch(Exception e){
            e.printStackTrace();
        }finally {
            if(fis != null){
                try {
                    fis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(fos != null){
                try {
                    fos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }

        }
    }


}
