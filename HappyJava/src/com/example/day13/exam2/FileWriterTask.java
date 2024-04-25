package com.example.day13.exam2;

import java.io.*;
import java.util.Scanner;

public class FileWriterTask implements Runnable{
    String path = "src/com/example/day13/exam2/output.txt";

    @Override
    public void run() {
        String str = "";
        System.out.println("파일에 저장할 내용을 입력하세요(종료를 원하시면 '종료'를 입력해주세요)");
        try(PrintWriter pw = new PrintWriter(path);
            Scanner sc = new Scanner(System.in)) {
            while (!str.equals("종료")) {
                str = sc.next();
                pw.println(str);
            }
        }catch (IOException e) {
                throw new RuntimeException(e);
        }
    }
}
