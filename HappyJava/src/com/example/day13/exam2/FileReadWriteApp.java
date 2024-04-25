package com.example.day13.exam2;

public class FileReadWriteApp {
    public static void main(String[] args) {
        Thread fileWriter = new Thread(new FileWriterTask());
        Thread fileReader = new Thread(new FileReaderTask());

        fileWriter.start();
        fileReader.start();
    }
}
