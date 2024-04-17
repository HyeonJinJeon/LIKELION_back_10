package com.example.day12.exam;

import java.io.*;

public class PhoneBook {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter("src/com/example/day12/exam/phoneBook.txt");){
            for(int i = 0; i < 3; i++){
                System.out.println("이름을 입력하세요");
                String name = br.readLine();
                System.out.println("전화번호를 입력하세요");
                String number = br.readLine();

                pw.println("이름: " + name);
                pw.println("전화번호: " + number);
            }
            System.out.println("전화번호가 src/com/example/day12/exam/phoneBook.txt에 저장되었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(BufferedReader readBr = new BufferedReader(new FileReader("src/com/example/day12/exam/phoneBook.txt"))){
            String str = null;
            System.out.println("src/com/example/day12/exam/phoneBook.txt의 내용은 다음과 같습니다");
            while((str = readBr.readLine()) != null){
                System.out.println(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
