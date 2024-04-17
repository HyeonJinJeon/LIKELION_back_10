package com.example.day12;

import java.io.*;

public class BufferedExam {
    public static void main(String[] args) {
        //키보드로부터 5번 입력 받아서 파일에 출력하는 프로그램을 작성해보세요
        String save = "";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter("d.txt")) {
            for(int i = 0; i < 5; i ++){
                System.out.println("아무거나 입력하세요.");
                String userInput = br.readLine();
                System.out.println(userInput);
                save += userInput+" ";
            }
            fw.write(save);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
