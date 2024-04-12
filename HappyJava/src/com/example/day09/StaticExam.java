package com.example.day09;

public class StaticExam {
    int i = 10;
    static int si = 20;

    public void m1(){
        System.out.println(i);
        System.out.println(si);
        sm();
    }
    public static void sm(){
//        System.out.println(i); // 불가능
        System.out.println(si);
//        m1(); // 불가능

        //static한 것들과 아닌 것들의 생성 시점이 다르다
        //static은 먼저 만들어져서 올라가고 아닌 것들은 인스턴스화 할때 생성되므로 먼저 만들어진 static에서 다른 것들을 접근하는 것은 불가능하다.
    }
}
