package com.example.day14.EchoThread2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient2 {
    public static void main(String[] args) {
        String hostName = "127.0.0.1";
        int portNumber = 10001;

        try (Socket echoSocket = new Socket(hostName, portNumber);
             PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
             BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))){
            String userInput;
            while ((userInput = stdIn.readLine()) != null){
                if("exit".equalsIgnoreCase(userInput.trim())){
                    System.out.println("메시지 전송을 종료합니다");
                    break;
                }
                out.println(userInput);
                System.out.println("echo : " + in.readLine());
            }

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
