package com.example.day12.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class UserInputHandler {
    List<String> list = new ArrayList<>();
    public List<String> getUserInput() throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
            String text;
            System.out.println("텍스트를 입력하세요 (종료 : 0)");
            while((text = br.readLine()) != null){
                if(text.equals("0")){
                    break;
                }
                list.add(text);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
