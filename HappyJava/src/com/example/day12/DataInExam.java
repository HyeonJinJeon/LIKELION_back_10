package com.example.day12;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInExam {
    public static void main(String[] args) {
        try(DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"))){
            boolean b = dis.readBoolean();
            System.out.println(b);
            byte bt = dis.readByte();
            System.out.println(bt);
            System.out.println(dis.readChar());
            System.out.println(dis.readDouble());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
