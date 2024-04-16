package com.example.day09;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeExam {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("현재 날까: " + date);
        System.out.println("현재 시간: " + time);
        System.out.println("현재 날짜와 시간: " + dateTime);

        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("현재 날짜와 시간(시간대 포함): " + now);

        //포맷팅하여 출력
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy=MM-dd HH:mm:ss z");
        System.out.println("포맷팅된 날짜와 시간: " + now.format(formatter));

        ZonedDateTime nowInNewYork = now.withZoneSameInstant(ZoneId.of("America/New_York"));

        LocalDate start = LocalDate.of(2020, 1, 1);
        LocalDate end = LocalDate.now();

        Period period = Period.between(start, end);
        System.out.println("기간: " + period.getYears() + "년 " + period.getMonths() + "개월 " + period.getDays() + "일");
    }
}
