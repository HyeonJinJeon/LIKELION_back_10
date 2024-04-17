package com.example.day12.exam;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextFileManager {
    List<String> list = new ArrayList<>();
    private String path;
    public TextFileManager(String path) {
        this.path = path;
    }

    public void writeToFile(List<String> userInput) throws IOException{
        try(PrintWriter pw = new PrintWriter(path);){
            for(String list : userInput){
                pw.println(list);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> readFromFile() throws IOException{
        try(BufferedReader readBr = new BufferedReader(new FileReader(path))){
            String str = null;
            while((str = readBr.readLine()) != null){
                list.add(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
