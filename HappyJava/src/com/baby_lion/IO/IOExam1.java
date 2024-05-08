package com.baby_lion.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOExam1 {
    public static void main(String[] args) {
        //파일로부터 읽어와서 콘솔에 출력하는 코드를 작성해보세요
        try(FileInputStream in = new FileInputStream("a.txt");) {
            int i = 1;
            int cnt = 0;
//            while ((i = in.read()) != -1){
//                cnt++;
//                System.out.print((char) i);
//            }
            //InputStream은 한번 흘러가면 다시 읽어오는 것이 불가능하다.
            byte[] b = new byte[512];
            while((i = in.read(b)) != -1){
                cnt++;
                String s = new String(b,0,i); // 각각의 byte를 char로 바꿔서 String으로 변환
                System.out.println(s);
            }
            System.out.println("총 cnt : " + cnt);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
