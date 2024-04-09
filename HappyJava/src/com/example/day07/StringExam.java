package com.example.day07;

public class StringExam {
    //같은 hello를 참조한다.

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";

        //새로운 hello를 만든다.
        String str3 = new String("hello");
        String str4 = new String("hello");

        if(str3.equals(str4)){
            System.out.println("같아요");
        }else {
            System.out.println("달라요");
        }

        System.out.println(str1 = str1.concat("h_jinnny"));
        System.out.println(str1);
    }
}
