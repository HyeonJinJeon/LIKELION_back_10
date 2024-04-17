package com.example.day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadFile {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("a.txt");
            FileOutputStream fos = new FileOutputStream("b.txt");
            int n;
//            byte[] bytes = new byte[1024];
//            while((n = fis.read(bytes)) != -1){
//                String str = new String(bytes);
////                System.out.println(str);
//                fos.write(bytes);
//            }
            while ((n=fis.read()) != -1) {
                System.out.println((char) n);
                fos.write(n);
            }
            fos.close();
            fis.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
