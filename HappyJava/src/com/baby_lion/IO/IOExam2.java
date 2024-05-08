package com.baby_lion.IO;

import javax.annotation.processing.SupportedSourceVersion;
import java.awt.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class IOExam2 {
    public static void main(String[] args) {
        try ( PrintWriter out = new PrintWriter("a.txt");
              BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            //문자열을 파일에다가 출력

            String str;
            System.out.println("저장할 내용 입력 (exit을 입력하면 끝내기)");
            while (!"exit".equalsIgnoreCase((str = br.readLine()))) {
                System.out.println(str + "\n");
                out.write(str + "\n");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
