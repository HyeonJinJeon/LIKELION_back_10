package com.example.day09;

public class PathVariableExam {
    public static void main(String[] args) {

        String pathVariable = System.getenv("PATH");
        System.out.println("Path Variable: " + pathVariable);
    }
}
