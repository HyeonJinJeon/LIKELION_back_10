package com.example.day12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class IOExam2 {
    public static void main(String[] args) throws Exception{
        //키보드로부터 한줄씩 입력 받아서 콘솔에 출력하고 싶다.

        //키보드 System.in
        //한줄씩 익기 위해서  BufferedReader

        //BufferedReader는 reader를 원하지만 System.in은 InputStream이므로 둘을 연결하기 위해 커넥터 같은 InputStreamReader가 필요!!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader br2 = new BufferedReader(new FileReader("a.txt"));


        String str = br.readLine();
        System.out.println(str);

        System.out.println(br2.readLine());
    }
}
