package com.example.day12;

import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("이름을 입력하세요: ");
            String name = scanner.nextLine();
            System.out.print("나이를 입력하세요: ");
            int age = scanner.nextInt();
            System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "살입니다.");
        } finally {
            scanner.close();
        }
    }
}
