package com.baby_lion.IO;

import java.io.*;

public class IOExam3 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("a.txt"));
            PrintWriter pw = new PrintWriter("b.txt")) {
            String line;
            while((line = br.readLine()) != null){
                pw.println(line);
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
