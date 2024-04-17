package com.example.day12;

import java.io.*;

public class IOExam3 {
    public static void main(String[] args) {
        //"test.txt"파일에서 한 줄 씩 입력받아서 입력받은 문자뒤에 hi를 추가해서
        // "texthi.txt" 파일에 출력하는 프로그램을 작성해보세요
//        String save = "";
        try (BufferedReader br = new BufferedReader(new FileReader("src/com/example/day12/text/test.txt"));
             FileWriter fw = new FileWriter("src/com/example/day12/text/testHi.txt");
             PrintWriter pw = new PrintWriter("src/com/example/day12/text/testHi.txt")) {
            String str;
            while((str = br.readLine()) != null) {
//                fw.write(str + " hi\n");
                pw.println(str + " hi");
            }
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
