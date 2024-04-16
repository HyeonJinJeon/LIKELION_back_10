package com.example.day09;

import java.util.Calendar;
import java.util.Scanner;

public class CalenderExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("년을 입력하세요: ");
        int year = sc.nextInt();

        System.out.println("월을 입력하세요: ");
        int month = sc.nextInt();

        printCalendar(year, month);
    }

    public static void printCalendar(int year, int month) {
        Calendar calendar = Calendar.getInstance();

        // 지정된 년월 설정
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1); // 월은 0부터 시작하므로 입력받은 월에서 1을 짼다.
        calendar.set(Calendar.DATE, 1); // 첫 번째 날짜로 설정

        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int firstDayOfMonth = calendar.get(Calendar.DAY_OF_WEEK);

        // 달력 출력
        System.out.println("\t\t" + year + "년 " + month + "월");
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        // 첫 번째 날짜 이전의 공백 출력
        for (int i = 1; i < firstDayOfMonth; i++) {
            System.out.print("\t");
        }

        // 날짜 출력
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.print(day + "\t");
            if ((day + firstDayOfMonth - 1) % 7 == 0) { // 7일마다 줄 바꿈
                System.out.println();
            }
        }
    }
}
