package com.example.day13.exam2;

import java.io.*;

public class FileReaderTask implements Runnable{
    String path = "src/com/example/day13/exam2/input.txt";
    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader(path));) {
            String str;
            while((str = br.readLine()) != null) {
                Thread.sleep(300);
                System.out.println(str);
            }
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
