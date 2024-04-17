package com.example.day09;

import com.example.day07.interfaceExam.Calculator;

import java.util.Calendar;
import java.util.Date;

public class DateExam {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now.getMonth());

        Date day = new Date(1999,1,11);
        System.out.println(day.getDate());

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime().getMonth());

        System.out.println(calendar.getActualMaximum(calendar.DATE));
    }
}
