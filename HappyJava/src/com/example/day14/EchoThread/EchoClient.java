package com.example.day14.EchoThread;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    private String name;

    public String getName() {
        return name;
    }

    public EchoClient(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        try(Socket socket = new Socket("127.0.0.1", 9999);
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader keybord = new BufferedReader(new InputStreamReader(System.in));)
        {
            String line = null;
            while ((line = keybord.readLine()) != null) {
                if ("exit".equalsIgnoreCase(line.trim())) {
                    System.out.println("메시지 전송을 종료합니다.");
                    break;
                }
                pw.println(line);
                String echo = br.readLine();
                System.out.println("서버로부터 받은 응답 메시지 : " + echo);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
